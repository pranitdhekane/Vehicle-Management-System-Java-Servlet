from maven:4.0.0-rc-5-ibm-semeru-25-noble AS build

WORKDIR /app


COPY pom.xml .

COPY  WebContent ./WebContent

COPY src ./src
 
RUN mvn clean package -DskipTests



FROM tomcat:9.0.121-jdk21-temurin

COPY --from=build /app/target/Vehicle.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh","run"]
