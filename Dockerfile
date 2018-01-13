FROM openjdk:8-jre-alpine

MAINTAINER ml9987@student.uni-lj.si

RUN mkdir /app

WORKDIR /app

ADD ./target/series-stream-0.0.8-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "series-stream-0.0.8-SNAPSHOT.jar"]