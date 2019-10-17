## 模块介绍
### 分布式配置——Spring Cloud Config
> spring Cloud Config为分布式系统中的外部配置提供服务器和客户端支持，可以方便的对微服务各个环境下的配置进行集中式管理。Spring Cloud Config分为Config Server和Config Client两部分。Config Server负责读取配置文件，并且暴露Http API接口，Config Client通过调用Config Server的接来读取配置文件。
## 启动命令
### eureka服务端
java -jar spring-boot-config-server--eureka-0.0.1-SNAPSHOT.jar