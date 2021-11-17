# Docker image for springboot application
# VERSION 0.0.1
# Author: bolingcavalry

### 基础镜像，使用alpine操作系统，openjkd使用8u201
FROM openjdk:8u201-jdk-alpine3.9

#应用构建成功后的jar文件被复制到镜像内，名字也改成了app.jar
ADD target/*.jar app.jar

#由于验证码需要的特殊字体在系统里是不存在的，不过sun的JDK是可以调用的，而openJDK不行，所以要么换JDK、要么安装字体库。
#装ttf-dejavu
RUN apk add --update font-adobe-100dpi ttf-dejavu fontconfig

#启动容器时的进程
#为了缩短 Tomcat 的启动时间，添加java.security.egd的系统属性指向/dev/urandom作为 ENTRYPOINT
ENTRYPOINT ["java", "-Xmx100m","-Djava.security.egd=file:/dev/./urandom", "-jar","/app.jar"]
