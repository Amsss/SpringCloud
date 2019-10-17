## 模块介绍
### 服务网关——Netflix Zuul
> Zuul相当于是第三方调用（app应用端和PC端）和服务提供方之间的防护门。作为前端服务（Edge Service也称边缘服务，前端服务的作用是对后端服务做必要的聚合和裁剪后暴露给外部不同的设备，如PC，Pad或者Phone），Zuul旨在实现动态路由，监控，弹性和安全性。它具备根据需求将请求路由到多个AWS自动弹性伸缩组的能力。
## 启动命令
### 依赖eureka版本
java -jar spring-boot-api-gateway-0.0.1-SNAPSHOT.jar
### 不依赖eureka版本
java -jar spring-boot-api-gateway-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev