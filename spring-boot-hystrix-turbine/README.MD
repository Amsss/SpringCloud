## 模块介绍
### 聚合监控——Netflix Turbine
> 在使用Hystrix Dashboard组件监控服务的熔断情况时,每个服务都有一个Hystrix Dashboard主页,当服务数量很多时,监控非常不方便.为了同时监控多个服务的熔断器的状况,Netflix开源了Hystrix的另一个组件Turbine.Turbine用于聚合多个Hystrix Dashboard,将多个Hystrix Dashboard组件的数据放在一个页面上展示,进行集中监控
## 启动命令
### 
java -jar spring-boot-hystrix-turbine-0.0.1-SNAPSHOT.jar