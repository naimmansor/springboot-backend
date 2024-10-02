FROM eclipse-temurin:21.0.1_12-jre-alpine
EXPOSE 9090
COPY target/moneyManagerMvp1-0.0.1.jar /app/moneyManagerMvp1-0.0.1.jar
WORKDIR /app
CMD ["java","-jar","/app/moneyManagerMvp1-0.0.1.jar"]