package com.hummer.k8s.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hummer.common.core.domain.*;
import com.hummer.common.core.domain.request.rule.BindRuleRequest;
import com.hummer.common.core.domain.request.rule.ScanGroupRequest;
import com.hummer.common.core.domain.request.server.ServerCertificateRequest;
import com.hummer.common.core.domain.request.server.ServerRequest;
import com.hummer.common.core.domain.request.server.ServerResultRequest;
import com.hummer.common.core.domain.request.server.ServerRuleRequest;
import com.hummer.common.core.dto.*;
import com.hummer.common.core.handler.annotation.I18n;
import com.hummer.common.core.utils.PageUtils;
import com.hummer.common.core.utils.Pager;
import com.hummer.common.security.service.TokenService;
import com.hummer.k8s.service.ServerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@Tag(name = "主机管理")
@RestController
@RequestMapping(value = "server")
public class ServerController {
    @Autowired
    private ServerService serverService;
    @Autowired
    private TokenService tokenService;

    @Operation(summary = "所有主机分组")
    @GetMapping("serverGroupList")
    public List<ServerGroup> getServerGroupList() {
        return serverService.getServerGroupList();
    }

    @I18n
    @Operation(summary = "所有主机")
    @GetMapping("allServerList")
    public List<Server> allServerList() {
        return serverService.allServerList();
    }

    @I18n
    @Operation(summary = "主机列表")
    @PostMapping("serverList/{goPage}/{pageSize}")
    public Pager<List<ServerDTO>> getServerList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody ServerRequest server) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, serverService.getServerList(server));
    }

    @Operation(summary = "查询主机")
    @GetMapping("getServer/{id}")
    public Server getServer(@PathVariable String id) throws Exception {
        return serverService.getServer(id);
    }

    @Operation(summary = "批量校验主机连通性")
    @PostMapping("validate")
    public List<ServerValidateDTO> validate(@RequestBody List<String> selectIds) {
        return serverService.validate(selectIds);
    }

    @Operation(summary = "校验主机配置连通性")
    @PostMapping("validate/{id}")
    public ServerValidateDTO validate(@PathVariable String id) throws Exception {
        return serverService.validate(id);
    }

    @Operation(summary = "一键检测主机规则")
    @PostMapping("scan")
    public void scan(@RequestBody ScanGroupRequest request) throws Exception {
        serverService.scan(request, tokenService.getLoginUser());
    }

    @Operation(summary = "添加主机分组")
    @PostMapping("addServerGroup")
    public int addServerGroup(@RequestBody ServerGroup serverGroup) {
        return serverService.addServerGroup(serverGroup, tokenService.getLoginUser());
    }

    @Operation(summary = "修改主机分组")
    @PostMapping("editServerGroup")
    public int editServerGroup(@RequestBody ServerGroup serverGroup) throws Exception {
        return serverService.editServerGroup(serverGroup, tokenService.getLoginUser());
    }

    @Operation(summary = "删除主机分组")
    @PostMapping("deleteServerGroup")
    public void deleteServerGroup(@RequestBody ServerGroup serverGroup) throws Exception {
        serverService.deleteServerGroup(serverGroup, tokenService.getLoginUser());
    }

    @Operation(summary = "添加主机")
    @PostMapping(value = "addServer", consumes = {"multipart/form-data"})
    public ServerValidateDTO addServer(@RequestPart(value = "keyFile", required = false) MultipartFile keyFile,
                                       @RequestPart("request") Server request) throws Exception {
        return serverService.addServer(keyFile, request, tokenService.getLoginUser());
    }

    @Operation(summary = "编辑主机")
    @PostMapping(value = "editServer", consumes = {"multipart/form-data"})
    public ServerValidateDTO editServer(@RequestPart(value = "keyFile", required = false) MultipartFile keyFile,
                                        @RequestPart("request") Server request) throws Exception {
        return serverService.editServer(keyFile, request, tokenService.getLoginUser());
    }

    @Operation(summary = "复制主机")
    @PostMapping(value = "copyServer", consumes = {"multipart/form-data"})
    public ServerValidateDTO copyServer(@RequestPart(value = "keyFile", required = false) MultipartFile keyFile,
                                        @RequestPart("request") Server request) throws Exception {
        return serverService.copyServer(keyFile, request, tokenService.getLoginUser());
    }

    @Operation(summary = "删除主机")
    @GetMapping("deleteServer/{id}")
    public void deleteServer(@PathVariable String id) throws Exception {
        serverService.deleteServer(id, tokenService.getLoginUser());
    }

    @I18n
    @Operation(summary = "主机规则列表")
    @PostMapping(value = "ruleList/{goPage}/{pageSize}")
    public Pager<List<ServerRuleDTO>> ruleList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody ServerRuleRequest request) throws Exception {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, serverService.ruleList(request));
    }

    @Operation(summary = "添加主机规则")
    @PostMapping(value = "addServerRule")
    public int addServerRule(@RequestBody ServerRuleRequest request) throws Exception {
        request.setId(null);
        return serverService.addServerRule(request);
    }

    @Operation(summary = "修改主机规则")
    @PostMapping(value = "updateServerRule")
    public int updateServerRule(@RequestBody ServerRuleRequest request) throws Exception {
        return serverService.updateServerRule(request);
    }

    @Operation(summary = "删除主机规则")
    @GetMapping(value = "deleteServerRule/{id}")
    public void deleteServerRule(@PathVariable String id) throws Exception {
        serverService.deleteServerRule(id, tokenService.getLoginUser());
    }

    @Operation(summary = "主机规则启用")
    @PostMapping(value = "changeStatus")
    public int changeStatus(@RequestBody ServerRule rule) throws Exception {
        return serverService.changeStatus(rule);
    }

    @I18n
    @Operation(summary = "主机检测结果列表(规则视角)")
    @PostMapping(value = "resultList/{goPage}/{pageSize}")
    public Pager<List<ServerResultDTO>> resultList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody ServerResultRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, serverService.resultList(request));
    }

    @I18n
    @Operation(summary = "主机检测结果列表(主机视角)")
    @PostMapping(value = "resultServerList/{goPage}/{pageSize}")
    public Pager<List<ServerListDTO>> resultServerList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody ServerRequest request) throws Exception {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, serverService.resultServerList(request));
    }

    @I18n
    @Operation(summary = "主机检测结果详情(主机视角)")
    @GetMapping(value = "resultServer/{serverId}")
    public ServerListDTO resultServer(@PathVariable String serverId) {
        return serverService.resultServer(serverId);
    }

    @I18n
    @Operation(summary = "主机规则检测结果详情(规则视角)")
    @GetMapping(value = "getServerResult/{resultId}")
    public ServerResultDTO getServerResult(@PathVariable String resultId) {
        return serverService.getServerResult(resultId);
    }

    @I18n
    @Operation(summary = "主机检测日志")
    @GetMapping(value = "log/{resultId}")
    public List<ServerResultLogWithBLOBs> getServerResultLog(@PathVariable String resultId) {
        return serverService.getServerResultLog(resultId);
    }

    @Operation(summary = "重新检测主机规则")
    @GetMapping("rescan/{id}")
    public void rescan(@PathVariable String id) throws Exception {
        serverService.rescan(id, tokenService.getLoginUser());
    }

    @Operation(summary = "重新整体主机检测")
    @GetMapping("rescanServer/{id}")
    public void rescanServer(@PathVariable String id) throws Exception {
        serverService.rescanServer(id, tokenService.getLoginUser());
    }

    @Operation(summary = "删除主机规则检测记录")
    @GetMapping("deleteServerResult/{id}")
    public void deleteServerResult(@PathVariable String id) throws Exception {
        serverService.deleteServerResult(id, tokenService.getLoginUser());
    }

    @Operation(summary = "删除主机整体检测记录")
    @GetMapping("deleteServerResultById/{id}")
    public void deleteServerResultById(@PathVariable String id) throws Exception {
        serverService.deleteServerResultByServerId(id, tokenService.getLoginUser());
    }

    @Operation(summary = "所有主机凭据")
    @GetMapping("allCertificateList")
    public List<ServerCertificate> allCertificateList() {
        return serverService.allCertificateList();
    }

    @I18n
    @Operation(summary = "主机凭据列表")
    @PostMapping("certificateList/{goPage}/{pageSize}")
    public Pager<List<ServerCertificateDTO>> certificateList(
            @PathVariable int goPage, @PathVariable int pageSize, @RequestBody ServerCertificateRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, serverService.certificateList(request));
    }

    @Operation(summary = "添加主机凭据")
    @PostMapping(value = "addCertificate", consumes = {"multipart/form-data"})
    public int addCertificate(@RequestPart(value = "keyFile", required = false) MultipartFile keyFile,
                              @RequestPart("request") ServerCertificate request) throws Exception {
        return serverService.addCertificate(keyFile, request, tokenService.getLoginUser());
    }

    @Operation(summary = "编辑主机凭据")
    @PostMapping(value = "editCertificate", consumes = {"multipart/form-data"})
    public int editCertificate(@RequestPart(value = "keyFile", required = false) MultipartFile keyFile,
                               @RequestPart("request") ServerCertificate request) throws Exception {
        return serverService.editCertificate(keyFile, request, tokenService.getLoginUser());
    }

    @Operation(summary = "删除主机凭据")
    @GetMapping("deleteCertificate/{id}")
    public void deleteCertificate(@PathVariable String id) throws Exception {
        serverService.deleteCertificate(id, tokenService.getLoginUser());
    }

    @I18n
    @Operation(summary = "概览TOP统计")
    @PostMapping("topInfo")
    public Map<String, Object> topInfo(@RequestBody Map<String, Object> params) {
        return serverService.topInfo(params);
    }

    @I18n
    @Operation(summary = "主机统计")
    @GetMapping("serverChart")
    public List<Map<String, Object>> serverChart() {
        return serverService.serverChart();
    }

    @I18n
    @Operation(summary = "主机风险统计")
    @GetMapping("severityChart")
    public List<Map<String, Object>> severityChart() {
        return serverService.severityChart();
    }

    @I18n
    @Operation(summary = "检测统计")
    @PostMapping("serverLineChart")
    public ChartDTO serverLineChart(@RequestBody Map<String, Object> params) {
        return serverService.serverLineChart(params);
    }

    @I18n
    @Operation(summary = "通过Excel导入专家数据")
    @PostMapping(value = "/ExcelInsertExperts", consumes = {"multipart/form-data"})
    public void insertExperts(@RequestPart(value = "file", required = false) MultipartFile file, @RequestPart("request") Server server) throws Exception {
        serverService.insertExperts(file, server, tokenService.getLoginUser());
    }

    @I18n
    @Operation(summary = "下载Excel示例")
    @GetMapping("/downloadExcel")
    public void downloadExcel(HttpServletResponse response) {
        FileInputStream fis = null;
        ServletOutputStream sos = null;
        try {
            String fileName = "template.xlsx";
            // resources下路径，比如文件位置在：resources/excel/template.xlsx
            String path = "excel/" + fileName;
            //设置响应头
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));

            ClassPathResource classPathResource = new ClassPathResource(path);
            InputStream inputStream = classPathResource.getInputStream();
            sos = response.getOutputStream();
            IOUtils.copy(inputStream, sos);
        } catch (Exception e) {
            throw new RuntimeException("下载失败！" + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (sos != null) {
                    sos.flush();
                    sos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @I18n
    @Operation(summary = "所有已绑定规则组的规则")
    @GetMapping("allBindList/{id}")
    public List<ServerRule> allBindList(@PathVariable String id) {
        return serverService.allBindList(id);
    }

    @I18n
    @Operation(summary = "所有未绑定规则组的规则")
    @GetMapping("unBindList/{id}")
    public List<ServerRule> unBindList(@PathVariable String id) {
        return serverService.unBindList(id);
    }

    @I18n
    @Operation(summary = "规则组绑定规则")
    @PostMapping(value = "bindRule")
    public void bindRule(@RequestBody BindRuleRequest request) throws Exception {
        serverService.bindRule(request);
    }

    @I18n
    @Operation(summary = "规则组")
    @GetMapping(value = "ruleGroups")
    public List<RuleGroup> getRuleGroups() {
        return serverService.getRuleGroups();
    }

    @I18n
    @Operation(summary = "按规则组检测主机规则")
    @GetMapping("scanByGroup/{groupId}/{serverId}")
    public void scanByGroup(@PathVariable String groupId, @PathVariable String serverId) throws Exception {
        serverService.scanByGroup(groupId, serverId, tokenService.getLoginUser());
    }

    @Operation(summary = "批量删除主机")
    @PostMapping("deleteServers")
    public void deleteServers(@RequestBody List<String> selectIds) throws Exception {
        serverService.deleteServers(selectIds, tokenService.getLoginUser());
    }

    @Operation(summary = "批量删除主机规则")
    @PostMapping("deleteServerRules")
    public void deleteServerRules(@RequestBody List<String> selectIds) throws Exception {
        serverService.deleteServerRules(selectIds, tokenService.getLoginUser());
    }

    @Operation(summary = "批量删除统一凭据")
    @PostMapping("deleteCertificates")
    public void deleteCertificates(@RequestBody List<String> selectIds) throws Exception {
        serverService.deleteCertificates(selectIds, tokenService.getLoginUser());
    }

    @Operation(summary = "批量删除主机检测结果")
    @PostMapping("deleteResults")
    public void deleteResults(@RequestBody List<String> selectIds) throws Exception {
        serverService.deleteResults(selectIds, tokenService.getLoginUser());
    }


}
