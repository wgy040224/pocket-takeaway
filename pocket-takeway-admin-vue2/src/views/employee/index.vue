<template>
  <div class="dashboard-container">
    <div class="container">
      <div class="tableBar">
        <label style="margin-right: 5px">员工姓名:</label>
        <el-input v-model="name" placeholder="请输入员工姓名" style="width: 15%" />
        <el-button type="primary" style="margin-left: 20px" @click="pageQuery()">查询</el-button>
        <el-button type="primary" style="float: right">+添加员工</el-button>
      </div>
    </div>

  </div>
</template>
<script lang="ts">

import {getEmployeeList} from '@/api/employee'

export default  {
  //模型数据
  data() {
    return {
      name: '', //员工姓名，对应上面的输入框
      page: 1,
      pageSize: 10,
      total: 0,
      records: []
    }
  },

  methods: {
    //分页查询
    pageQuery() {
      //准备请求的参数
      const params = {name: this.name, page: this.page, pageSize: this.pageSize}

      //发送ajax请求，访问后端服务，获取分页数据
      getEmployeeList(params)
    }
  }  
}

</script>

<style lang="scss" scoped>
.disabled-text {
  color: #bac0cd !important;
}
</style>
