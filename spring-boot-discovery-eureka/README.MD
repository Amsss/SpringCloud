## 模块介绍
### 服务发现——Netflix Eureka
> Eureka 是 Netflix 出品的用于实现服务注册和发现的工具。 Spring Cloud 集成了 Eureka，并提供了开箱即用的支持。其中， Eureka 又可细分为 Eureka Server 和 Eureka Client。
## 启动命令 eureka 高可用集群启动命令（2节点）
### peer1节点
java -jar spring-boot-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
### peer2节点
java -jar spring-boot-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2