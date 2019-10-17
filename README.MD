# springCloud 学习
> Spring Cloud是一个集成了众多开源的框架，利用Spring Boot的开发便利性实现了服务治理、服务注册与发现、负载均衡、数据监控，REST API发布方式等，基本囊括了分布式框架所需要的所有功能。是一套易开放、易部署、易维护的分布式开发工具包。

## 服务发现——Netflix Eureka
> Eureka 是 Netflix 出品的用于实现服务注册和发现的工具。 Spring Cloud 集成了 Eureka，并提供了开箱即用的支持。其中， Eureka 又可细分为 Eureka Server 和 Eureka Client。

## 客服端负载均衡——Netflix Ribbon
> Ribbon是Netflix发布的开源项目，主要功能是提供客户端的软件负载均衡算法，将Netflix的中间层服务连接在一起。Ribbon客户端组件提供一系列完善的配置项如连接超时，重试等。简单的说，就是在配置文件中列出Load Balancer后面所有的机器，Ribbon会自动的帮助你基于某种规则（如简单轮询，随机连接等）去连接这些机器。我们也很容易使用Ribbon实现自定义的负载均衡算法。简单地说，Ribbon是一个客户端负载均衡器。

## 客服端负载均衡——Netflix Feign
> Feign是一个声明式的web service客户端，它使得编写web service客户端更为容易。创建接口，为接口添加注解，即可使用Feign。Feign可以使用Feign注解或者JAX-RS注解，还支持热插拔的编码器和解码器。Spring Cloud为Feign添加了Spring MVC的注解支持，并整合了Ribbon和Eureka来为使用Feign时提供负载均衡。

## 断路器——Netflix Hystrix
> 在分布式环境中，许多服务依赖项中的一些必然会失败。Hystrix是一个库，通过添加延迟容忍和容错逻辑，帮助你控制这些分布式服务之间的交互。Hystrix通过隔离服务之间的访问点、停止级联失败和提供回退选项来实现这一点，所有这些都可以提高系统的整体弹性

## 图形化监控界面——Netflix Dashboard
> Hystrix Dashboard是作为断路器状态的一个组件，提供了数据监控和友好的图形化界面

## 聚合监控——Netflix Turbine
> 在使用Hystrix Dashboard组件监控服务的熔断情况时,每个服务都有一个Hystrix Dashboard主页,当服务数量很多时,监控非常不方便.为了同时监控多个服务的熔断器的状况,Netflix开源了Hystrix的另一个组件Turbine.Turbine用于聚合多个Hystrix Dashboard,将多个Hystrix Dashboard组件的数据放在一个页面上展示,进行集中监控

## 服务网关——Netflix Zuul
> Zuul相当于是第三方调用（app应用端和PC端）和服务提供方之间的防护门。作为前端服务（Edge Service也称边缘服务，前端服务的作用是对后端服务做必要的聚合和裁剪后暴露给外部不同的设备，如PC，Pad或者Phone），Zuul旨在实现动态路由，监控，弹性和安全性。它具备根据需求将请求路由到多个AWS自动弹性伸缩组的能力。

## 分布式配置——Spring Cloud Config
> spring Cloud Config为分布式系统中的外部配置提供服务器和客户端支持，可以方便的对微服务各个环境下的配置进行集中式管理。Spring Cloud Config分为Config Server和Config Client两部分。Config Server负责读取配置文件，并且暴露Http API接口，Config Client通过调用Config Server的接来读取配置文件。

## 
