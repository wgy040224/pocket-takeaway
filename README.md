# 口袋外卖项目

## 项目简介
口袋外卖是一款为餐饮企业（如餐厅、饭店）定制的软件产品，包括系统管理后台和小程序端应用两部分。系统管理后台主要供餐饮企业内部员工使用，可以对餐厅的分类、菜品、套餐、订单、员工等进行管理维护，对餐厅的各类数据进行统计，同时也可进行来单语音播报功能。小程序端主要提供给消费者使用，可以在线浏览菜品、添加购物车、下单、支付、催单等。

## 功能特点
- **微信登录**：用户端支持微信授权快速登录。
- **丰富的统计报表**：为餐饮企业提供营业额、用户数量、订单等数据统计。
- **实时来单提醒**：新订单实时提醒，提高接单效率。
- **客户催单功能**：客户可通过小程序端直接催单，提升用户体验。
- **订单管理**：全面的订单管理功能，包括查询、取消、派送、完成等。

## 技术选型
- **前端技术**：微信小程序、Vue.js、ElementUI
- **后端技术**：SpringBoot、SSM（Spring + SpringMVC + MyBatis）
- **数据库**：MySQL
- **缓存与消息队列**：Redis
- **其他技术**：Nginx、JWT、Swagger、WebSocket等

## 开发环境搭建
1. **环境要求**：
   - Java开发环境（JDK 1.8+）
   - MySQL数据库
   - Redis缓存服务
   - Nginx服务器（可选，用于负载均衡和反向代理）

2. **项目导入**：
   - 使用IDEA或Eclipse导入项目，并安装好相应的插件。
   - 导入数据库脚本，创建数据库和表结构。

3. **依赖安装**：
   - 使用Maven进行项目依赖的安装。

## 运行步骤
1. **启动后端服务**：
   - 运行项目中的启动类，启动SpringBoot应用。

2. **启动前端服务**：
   - 启动微信小程序开发工具，打开小程序项目进行预览和调试。

3. **访问项目**：
   - 通过浏览器或微信小程序访问系统管理后台和用户端应用。

## 注意：

后端项目中，请在 `pocket-takeway-server/src/main/resources/` 添加 `application-dev.yml`配置文件

文件内容为：

```yml
pocket:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    host: localhost
    port: 3306
    database: pocket_takeway
    username: root
    password: xxx
  redis:
    host: localhost
    port: 6379
    password: xxx
    database: 0
  wechat:
    appid: wxxx
    secret: xxx
    alioss:
      bucket-name: xxx
      endpoint: xxx
      access-key-id: xxx
      access-key-secret: xxx
```

## 接口文档

项目接口文档使用Swagger生成，启动项目后访问以下地址查看接口文档：http://localhost:8080/doc.html