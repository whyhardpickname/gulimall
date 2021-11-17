# Docker image for springboot application
# VERSION 0.0.1
# Author: bolingcavalry

### 基础镜像，使用alpine操作系统，openjkd使用8u201
FROM openjdk:8u201-jdk-alpine3.9

#应用构建成功后的jar文件被复制到镜像内，名字也改成了app.jar
ADD target/*.jar app.jar

#启动容器时的进程
#为了缩短 Tomcat 的启动时间，添加java.security.egd的系统属性指向/dev/urandom作为 ENTRYPOINT
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=10001", "-Xmx100m","-Djava.security.egd=file:/dev/./urandom", "-jar","/app.jar"]
