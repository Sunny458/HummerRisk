<template>

  <div>
    <el-row class="table-title" type="flex" justify="space-between" align="middle" v-if="showName">
      <slot name="title">
        {{ title }}
      </slot>
    </el-row>
    <el-row type="flex" justify="space-between" align="middle">
      <span class="operate-button operate-btn">
        <table-button v-if="showSync" icon="el-icon-sort-down" :showName="showSyncName"
                      type="primary" :content="syncTip" @click="sync"/>
        <table-button v-if="showCreate" icon="el-icon-circle-plus-outline" :showName="showCreateName"
                      type="primary" :content="createTip" @click="create"/>
        <table-button v-if="showScan" icon="el-icon-video-play" :showName="showScanName"
                              type="success" :content="scanTip" @click="scan"/>
        <table-button v-if="showValidate" icon="el-icon-video-play" :showName="showValidateName"
                         type="warning" :content="validateTip" @click="validate"/>
        <table-button v-if="showSetting" icon="el-icon-s-tools" :showName="showSettingName"
                      type="warning" :content="settingTip" @click="setting"/>
        <table-button v-if="showDelete" icon="el-icon-remove-outline" :showName="showDeleteName"
                      type="danger" :content="deleteTip" @click="deleteSelect"/>
        <table-search-bar v-if="isCombine" :condition.sync="condition" @change="search" @search="search" class="search-bar" @upload="upload" :showCreate="showCreate"
                          :showFilter="showFilter" :showUpload="showUpload" :showUploadName="showUploadName" :tip="tip" :items="items" ref="conditionSearch"/>
        <slot name="button"></slot>
      </span>
      <span class="operate-button operate-right">
        <table-adv-search-bar v-if="isCombine" :showOpen="showOpen" :showList="showList" @search="search" @pdfDown="pdfDown" @excelDown="excelDown" @more="more" @menu="menu"
                              :columnNames="columnNames" :checkedColumnNames="checkedColumnNames" :checkAll="checkAll" :isIndeterminate="isIndeterminate"
                              @handleCheckedColumnNamesChange="handleCheckedColumnNamesChange" @handleCheckAllChange="handleCheckAllChange"/>
      </span>
    </el-row>

    <el-row v-show="normals && ((normals.length > 0) || (tags && Object.keys(tags).length > 0))" type="flex" justify="space-between" align="middle">
      <span>
        <I style="font-size: 12px;color: #888">{{ $t('commons.filter_condition') }} </I>
        <el-tag v-show="normals.length > 0" v-for="(normal, index) in normals" :key="index" closable type="success" size="mini" class="el-tag-con" @close="handleClose2(normal)">
          {{ $t(normal.i18nKey) }} : {{ normal.searchValue }}
        </el-tag>
        <el-tag v-show="tags && Object.keys(tags).length > 0 && !tags.ruleTag" v-for="(value, key) in tags" :key="key" closable type="info" size="mini" class="el-tag-con" @close="handleClose(key)">
          {{ $t(value.label) }} : {{ value.valueArray }}
        </el-tag>
      </span>
    </el-row>
  </div>

</template>

<script>
import TableSearchBar from '@/business/components/common/components/TableSearchBar';
import TableButton from '@/business/components/common/components/TableButton';
import TableAdvSearchBar from "@/business/components/common/components/search/TableAdvSearchBar";
// 引入导出Excel表格依赖
import FileSaver from "file-saver";
import XLSX from "xlsx";
import htmlToPdf from "@/common/js/htmlToPdf";
import Vue from "vue";
/* eslint-disable */
  export default {
    name: "TableHeader",
    components: {
      TableAdvSearchBar,
      TableSearchBar,
      TableButton
    },
    data(){
      return {
        htmlTitle: this.$t('pdf.html_title'),
        tags: [],
        normals: [],
      }
    },
    props: {
      title: {
        type: String,
        default() {
          return this.$t('commons.name');
        }
      },
      showSync: {
        type: Boolean,
        default: false
      },
      showCreate: {
        type: Boolean,
        default: false
      },
      showScan: {
        type: Boolean,
        default: false
      },
      showValidate: {
        type: Boolean,
        default: false
      },
      showSetting: {
        type: Boolean,
        default: false
      },
      showDelete: {
        type: Boolean,
        default: false
      },
      showSyncName: {
        type: Boolean,
        default: true
      },
      showCreateName: {
        type: Boolean,
        default: true
      },
      showScanName: {
        type: Boolean,
        default: true
      },
      showValidateName: {
        type: Boolean,
        default: true
      },
      showSettingName: {
        type: Boolean,
        default: true
      },
      showDeleteName: {
        type: Boolean,
        default: true
      },
      condition: {
        type: Object
      },
      syncTip: {
        type: String,
        default() {
          return this.$t('image.image_sync');
        }
      },
      createTip: {
        type: String,
        default() {
          return this.$t('commons.create');
        }
      },
      scanTip: {
        type: String,
        default() {
          return this.$t('account.scan');
        }
      },
      validateTip: {
        type: String,
        default() {
          return this.$t('account.validate');
        }
      },
      settingTip: {
        type: String,
        default() {
          return this.$t('commons.batch_settings');
        }
      },
      tip: {
        String,
        default() {
          return this.$t('commons.search_by_name');
        }
      },
      deleteTip: {
        type: String,
        default() {
          return this.$t('oss.delete_batch');
        }
      },
      showOpen: {
        type: Boolean,
        default: true
      },
      showFilter: {
        type: Boolean,
        default: true
      },
      showList: {
        type: Boolean,
        default: false
      },
      showName: {
        type: Boolean,
        default: true
      },
      showUpload: {
        type: Boolean,
        default: false
      },
      showUploadName: {
        type: Boolean,
        default: false
      },
      items: {
        type: [Object,Array],
        default: () => [
          {'id' : 'name', 'name' : 'commons.name'},
        ],
      },
      columnNames: {
        type: [Object,Array],
      },
      checkedColumnNames: {
        type: [Object,Array],
      },
      checkAll: {
        type: Boolean,
        default: true
      },
      isIndeterminate: {
        type: Boolean,
        default: false
      },
    },
    methods: {
      search(value) {
        if (this.condition.combine) {
          this.tags = this.condition.combine;
        }
        if (this.condition.normalSearch) {
          this.normals = this.condition.normalSearch;
        }
        this.$emit('update:condition', this.condition);
        this.$emit('search', value);
      },
      sync() {
        this.$emit('sync');
      },
      create() {
        this.$emit('create');
      },
      scan() {
        this.$emit('scan');
      },
      validate() {
        this.$emit('validate');
      },
      setting() {
        this.$emit('setting');
      },
      //下载excel
      excelDown() {
        /* 从表生成工作簿对象 */
        // 判断要导出的节点中是否有fixed的表格，如果有，转换excel时先将该dom移除，然后append回去，
        let fix = document.querySelector("#out-table .el-table__fixed-right");//如果是只有右边有fixed样式
        let wb;
        if (fix) {
          document.querySelector("#out-table").removeChild(fix, {raw:true});
          //raw - true 导出的内容只做解析，不进行格式转换
          wb = XLSX.utils.table_to_book(document.querySelector("#out-table"));
          document.querySelector("#out-table").appendChild(fix);
        } else {
          wb = XLSX.utils.table_to_book(document.querySelector("#out-table"),{raw:true});
        }
        /* 获取二进制字符串作为输出 */
        var wbout = XLSX.write(wb, {
          bookType: "xlsx",
          bookSST: true,
          type: "array"
        });
        try {
          FileSaver.saveAs(
            //Blob 对象表示一个不可变、原始数据的类文件对象。
            //Blob 表示的不一定是JavaScript原生格式的数据。
            //File 接口基于Blob，继承了 blob 的功能并将其扩展使其支持用户系统上的文件。
            //返回一个新创建的 Blob 对象，其内容由参数中给定的数组串联组成。
            new Blob([wbout], { type: "application/octet-stream" }),
            //设置导出文件名称
            "table.xlsx"
          );
        } catch (e) {
          if (typeof console !== "undefined") console.log(e, wbout);
        }
        return wbout;
      },
      //下载pdf
      pdfDown() {
        htmlToPdf.getPdf(this.htmlTitle);
      },
      deleteSelect() {
        this.$emit('delete');
      },
      handleCheckAllChange(val) {
        this.$emit('handleCheckAllChange', val);
      },
      handleCheckedColumnNamesChange(value) {
        this.$emit('handleCheckedColumnNamesChange', value);
      },
      more() {
        this.$emit('more');
      },
      menu() {
        this.$emit('menu');
      },
      upload() {
        this.$emit('upload');
      },
      handleClose(key) {
        Vue.delete(this.condition.combine, key);
        this.search(null);
        this.$refs.conditionSearch.conditionSearch(this.condition.combine);
      },
      handleClose2(normal) {
        //普通搜索 对象数组删除元素 [{},{}] => [{}]
        let arr = this.condition.normalSearch.length;
        for (let i = 0; i < arr; i++) {
          if(normal === this.condition.normalSearch[i]) {
            this.condition.normalSearch.splice(i, 1);
            this.condition[normal.searchName] = '';
          }
        }
        this.search(null);
        this.$refs.conditionSearch.conditionSearch2(this.condition.normalSearch);
      },
    },
    computed: {
      isCombine() {
        return this.condition.components !== undefined && this.condition.components.length > 0;
      }
    },
    created() {
    }
  }
</script>

<style>

  .table-title {
    height: 40px;
    font-weight: bold;
    font-size: 18px;
  }

</style>

<style scoped>

  .operate-btn {
    min-width: 75%;
  }

  .operate-right {
    float: right;
  }

  .operate-button {
    margin-bottom: -5px;
  }

  .search-bar {
  }

  .el-tag-con {
    margin: 2px 5px 0 0;
  }

</style>
