# Nacos使用示例

# 版本号

| 项目                         | 版本号     |
| ---------------------------- | ---------- |
| spring-cloud.version         | 2021.0.1   |
| spring-cloud-alibaba.version | 2021.0.1.0 |
| springboot.version           | 2.6.6      |
| java.version                 | 1.8        |



## 项目结构

```
├── nacosdemo
│   └──configuration 
│   └──configuration_old 
│   └──registration 
│   └──└──producer_a
│   └──└──producer_b
│   └──└──consumer
```

## 配置中心DEMO

```
├── nacosdemo 
│   └──configuration 
│   └──configuration_old 
```



| 项目              | 端口   | 说明                                                         |
| ----------------- |------| ------------------------------------------------------------ |
| configuration     | 8801 | 配置中心DEMO<br />2021.0.1.0 之后推荐用法，因为Spring Cloud 在Spring boot 2.4以后无法应用bootStrap.yml |
| configuration_old | 8802 | 配置中心（兼容bootStrap.yml配置文件）                        |

## 注册中心DEMO

```
├── nacosdemo
│   └──registration 
│   └──└──producer_a 
│   └──└──producer_b 
│   └──└──consumer 
```

| 项目       | 端口 | 说明           |
| ---------- | ---- | -------------- |
| consumer   | 8101 | 业务请求接收者 |
| producer_a | 8001 | 业务处理者：A  |
| producer_b | 8002 | 业务处理者：B  |



