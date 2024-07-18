FROM openjdk:21
EXPOSE 8080
COPY target/moneyManagerMvp1-0.0.1.jar /app/moneyManagerMvp1-0.0.1.jar
WORKDIR /app
CMD ["java","-jar","/app/moneyManagerMvp1-0.0.1.jar"]