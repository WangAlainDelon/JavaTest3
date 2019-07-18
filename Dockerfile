
FROM registry.saas.hand-china.com/tools/javabase:0.5.0

MAINTAINER wangxaing

COPY /exam1-0.0.1-SNAPSHOT.jar /wxapp.jar
 
CMD java -jar /wxapp.jar

EXPOSE 8080