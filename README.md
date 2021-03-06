## JavaEE 实践作业（建议使用idea来导入项目）

This is a JavaEE project demo based on SSM.It show us how to use SpringBoot, MyBatis, echart directly and simply.If you are a beginner in SSM or just want to build a SSM project immediately, you can fork it and learn it. I think it can be useful to you.

### 
* Spring ->简化开发-> [Spring boot]

* springboot内置tomcat（服务器）
简化了servlet


前端技术：<br/>
jsp：前后端不分离，java view resolver （数据 -> html片段）<br/>
本项目：前后端分离（<br/>
    java 后端 查询 处理 数据<br/>
    -> json<br/>
    -> 前端<br/>
    -> js来动态生成展示的数据，而不是使用后端传来的html<br/>
）<br/><br/>

数据库操作ORM框架：<br/>
X hibernate<br/>
X 直接操作<br/>
√ MyBatis 操作数据库的orm框架 来操作数据库<br/>




### 一、SQL文件
* 位置： **JavaEE-project/SQL**
* 使用时候把里面的.sql文件导入到自己的数据库

### 二、前端页面
* 位置：**JavaEE-project/client**
* 目前我们使用的页面是client下的**index.html**
* 其他页面都可以在本地打开，里面有的图表我们都可以搞数据，没事干可以看一看哪页面的哪个图标适合我们搞数据

### 三、后端程序
* 位置：**JavaEE-project/server/src/main/java/com/yzcz/server**
* 项目使用了SpringBoot框架，数据库访问使用了MyBatis
    - **controller**: 控制器层，主要是处理url请求[Get/Post/Put/Delete]
    - **mapper**: DAO层，与数据库操作有关
    - **model**: 模型层，与数据库对应javaBean有关
    - **service**: Service层，用于业务逻辑
    - **config**: 里面是配置相关，主要是springboot的包扫描配置和Mybatis配置

### 四、数据库配置
* 位置：**JavaEE-project\server\src\main\resources\application.yml**
* 里面主要关注下面的部分代码，其中改为自己的数据库信息
```yaml
      url: jdbc:mysql://127.0.0.1:3306/YourDatabaseName?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC
      username: YourMysqlAccount
      password: "YourMysqlPassword"
```

### 五、启动
1. 首先导入sql文件
    - 四张表：Sql文件名就是表名

2. 配置上文提到的**application.yml**为自己的数据库信息（url，username，root都需要配置）

3. 运行Java程序：**JavaEE-project\server\src\main\java\com\yzcz\server\ServerApplication.java**
   ![start-0](./img/start-0.png)
   <br/>**如果没有这个选项，或者这个java类不能运行，可以参考下面的流程**：
   
   1. 首先点击项目右侧gradle，然后发现目录树中只有一个main，点击+号 
      ![start-1](./img/start-1.png)
   2. 窗口中选中当前项目-server模块-build.gradle，点击OK
      ![start-2](./img/start-2.png)
   3. 稍等一会儿下载完，再运行ServerApplication
      ![start-3](./img/start-3.png)

    
4. 在上文提到的client中，用浏览器打开项目中的**index.html**文件，如果前面运行正常，那么数据就会从数据库取出来，展示到html页面中



