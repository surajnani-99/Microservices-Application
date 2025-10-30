FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/home-service-1.0.0.jar app.jar
#RUN curl -Lo applicationinsights-agent.jar https://aka.ms/ai/javaagent
#ENV JAVA_TOOL_OPTIONS="-javaagent:/app/applicationinsights-agent.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]



