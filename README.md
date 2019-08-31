# kings
collection of service tools
一个简单的JAVA服务工具集合，会不断增加一些基础框架功能，如工具类、异常处理、日志处理、常用第三方功能封装等。

## 项目结构说明

|模块             |说明                                  |
|-----------------|-------------------------------------|
|kings-boot        |启动模块                              |
|kings-common      |通用功能模块                           |
|kings-dal         |Data Access Layer 数据访问层模块       |
|kings-facade      |对外服务能力                           |
|kings-facade-api  |对外服务能力接口                        |
|kings-rpc         |Remote Procedure Call 调用第三方服务封装|
|kings-rpc-api     |Remote Procedure Call 调用第三方API封装|
|kings-service     |业务层                                |
|kings-service-api |业务层API                             |
|kings-web         |web层                                |

**需要注意的是，**

- kings-common模块作为基础功能可以被其他任何模块依赖。
- kings-rpc作为封装第三方服务的模块，会依赖很多第三方服务，不应该被其他模块所依赖，其他模块应该依赖的是kings-rpc-api。
- kings-facade层将本系统的功能封装后对外提供服务能力，外部系统应当只需要依赖kings-facade-api模块，屏蔽具体实现。
- 因此，kings-rpc-api和kings-facade-api两个模块的pom依赖应当尽可能简单、干净。