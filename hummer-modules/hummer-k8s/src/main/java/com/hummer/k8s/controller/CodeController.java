package com.hummer.k8s.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hummer.common.core.domain.*;
import com.hummer.common.core.domain.request.code.CodeRequest;
import com.hummer.common.core.domain.request.code.CodeResultItemRequest;
import com.hummer.common.core.domain.request.code.CodeResultRequest;
import com.hummer.common.core.domain.request.code.CodeRuleRequest;
import com.hummer.common.core.dto.CodeDTO;
import com.hummer.common.core.dto.CodeResultDTO;
import com.hummer.common.core.dto.CodeRuleDTO;
import com.hummer.common.core.handler.annotation.I18n;
import com.hummer.common.core.utils.PageUtils;
import com.hummer.common.core.utils.Pager;
import com.hummer.common.security.service.TokenService;
import com.hummer.k8s.service.CodeService;
import io.kubernetes.client.openapi.ApiException;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Hidden;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Tag(name = "源码管理")
@RestController
@RequestMapping(value = "code")
public class CodeController {

    @Autowired
    private CodeService codeService;
    @Autowired
    private TokenService tokenService;

    @I18n
    @Operation(summary = "源码项目列表")
    @PostMapping("list/{goPage}/{pageSize}")
    public Pager<List<CodeDTO>> codeList(
            @PathVariable int goPage, @PathVariable int pageSize, @RequestBody CodeRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, codeService.codeList(request));
    }

    @I18n
    @Operation(summary = "所有项目源码")
    @GetMapping("allList")
    public List<Code> allList() {
        return codeService.allList();
    }

    @I18n
    @Operation(summary = "所有已绑定项目的源码")
    @GetMapping("allBindList/{sbomVersionId}")
    public List<Code> allBindList(@PathVariable String sbomVersionId) {
        return codeService.allBindList(sbomVersionId);
    }

    @I18n
    @Operation(summary = "所有未绑定项目的源码")
    @GetMapping("unBindList")
    public List<Code> unBindList() {
        return codeService.unBindList();
    }

    @I18n
    @Operation(summary = "添加源码项目")
    @PostMapping(value = "addCode")
    public Code addCode(@RequestBody Code request) throws Exception {
        return codeService.addCode(request, tokenService.getLoginUser());
    }

    @I18n
    @Operation(summary = "修改源码项目")
    @PostMapping(value = "updateCode")
    public Code updateCode(@RequestBody Code request) throws Exception {
        return codeService.updateCode(request, tokenService.getLoginUser());
    }

    @Operation(summary = "删除源码项目")
    @GetMapping("deleteCode/{id}")
    public void deleteCode(@PathVariable String id) throws Exception {
        codeService.deleteCode(id, tokenService.getLoginUser());
    }

    @Operation(summary = "批量校验源码账号")
    @PostMapping("validate")
    public Boolean validate(@RequestBody List<String> selectIds) {
        return codeService.validate(selectIds);
    }

    @Operation(summary = "校验源码账号")
    @PostMapping("validate/{id}")
    public Boolean validate(@PathVariable String id) throws IOException, ApiException {
        return codeService.validate(id);
    }

    @I18n
    @Operation(summary = "源码检测规则列表")
    @PostMapping(value = "ruleList/{goPage}/{pageSize}")
    public Pager<List<CodeRuleDTO>> ruleList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody CodeRuleRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, codeService.ruleList(request));
    }

    @Operation(summary = "添加源码检测规则")
    @PostMapping(value = "addCodeRule")
    public int addCodeRule(@RequestBody CodeRuleRequest request) throws Exception {
        return codeService.addCodeRule(request, tokenService.getLoginUser());
    }

    @Operation(summary = "修改源码检测规则")
    @PostMapping(value = "updateCodeRule")
    public int updateCodeRule(@RequestBody CodeRuleRequest request) throws Exception {
        return codeService.updateCodeRule(request, tokenService.getLoginUser());
    }

    @Operation(summary = "删除源码检测规则")
    @GetMapping(value = "deleteCodeRule/{id}")
    public void deleteCodeRule(@PathVariable String id) throws Exception  {
        codeService.deleteCodeRule(id, tokenService.getLoginUser());
    }

    @Operation(summary = "源码检测规则启用")
    @PostMapping(value = "changeStatus")
    public int changeStatus(@RequestBody CodeRule rule) throws Exception {
        return codeService.changeStatus(rule);
    }

    @Operation(summary = "源码检测规则")
    @GetMapping("scan/{id}")
    public void scan(@PathVariable String id) throws Exception {
        codeService.scan(id, tokenService.getLoginUser());
    }

    @Operation(summary = "重新检测源码规则")
    @GetMapping("reScan/{id}")
    public void reScan(@PathVariable String id) throws Exception {
        codeService.reScan(id, tokenService.getLoginUser());
    }

    @I18n
    @Operation(summary = "源码检测结果列表")
    @PostMapping(value = "resultListWithBLOBs/{goPage}/{pageSize}")
    public Pager<List<CodeResultDTO>> resultListWithBLOBs(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody CodeResultRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, codeService.resultListWithBLOBs(request));
    }

    @I18n
    @Hidden
    @PostMapping(value = "resultList/{goPage}/{pageSize}")
    public Pager<List<CodeResultDTO>> resultList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody CodeResultRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, codeService.resultList(request));
    }

    @I18n
    @Operation(summary = "源码检测结果详情")
    @GetMapping(value = "getCodeResult/{resultId}")
    public CodeResultDTO getCodeResult(@PathVariable String resultId) {
        return codeService.getCodeResult(resultId);
    }

    @I18n
    @Operation(summary = "源码检测日志")
    @GetMapping(value = "log/{resultId}")
    public List<CodeResultLogWithBLOBs> getCodeResultLog(@PathVariable String resultId) {
        return codeService.getCodeResultLog(resultId);
    }

    @Operation(summary = "删除源码检测记录")
    @GetMapping("deleteCodeResult/{id}")
    public void deleteCodeResult(@PathVariable String id) throws Exception {
        codeService.deleteCodeResult(id, tokenService.getLoginUser());
    }

    @I18n
    @Hidden
    @PostMapping("resultItemList/{goPage}/{pageSize}")
    public Pager<List<CodeResultItemWithBLOBs>> resultItemList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody CodeResultItem request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, codeService.resultItemList(request));
    }

    @I18n
    @Operation(summary = "检测结果详情")
    @PostMapping("resultItemListBySearch/{goPage}/{pageSize}")
    public Pager<List<CodeResultItemWithBLOBs>> resultItemListBySearch(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody CodeResultItemRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, codeService.resultItemListBySearch(request));
    }

    @Operation(summary = "Git插件详情")
    @GetMapping("plugin")
    public String getCredential() {
        return codeService.getCredential();
    }

    @I18n
    @Operation(summary = "源码概览TOP统计")
    @PostMapping("topInfo")
    public Map<String, Object> topInfo(@RequestBody Map<String, Object> params) {
        return codeService.topInfo(params);
    }

    @I18n
    @Operation(summary = "源码项目统计")
    @GetMapping("projectChart")
    public List<Map<String, Object>> projectChart() {
        return codeService.projectChart();
    }

    @I18n
    @Operation(summary = "源码风险统计")
    @GetMapping("severityChart")
    public List<Map<String, Object>> severityChart() {
        return codeService.severityChart();
    }

    @Operation(summary = "下载检测报告")
    @PostMapping("download")
    public String download(@RequestBody Map<String, Object> map) throws Exception {
        return codeService.download(map);
    }

    @I18n
    @Operation(summary = "检测结果历史详情")
    @PostMapping("historyResultItemList")
    public List<CodeResultItemWithBLOBs> historyResultItemList(@RequestBody CodeResultItem request) {
        return codeService.historyResultItemList(request);
    }

    @Operation(summary = "批量删除源码")
    @PostMapping("deleteCodes")
    public void deleteCodes(@RequestBody List<String> selectIds) throws Exception {
        codeService.deleteCodes(selectIds, tokenService.getLoginUser());
    }
}
