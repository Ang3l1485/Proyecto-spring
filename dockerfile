# Build stage
FROM eclipse-temurin:21-jdk AS builder
WORKDIR /app
COPY . .
# If you use Maven Wrapper:
RUN ./mvnw -q -DskipTests package

# Run stage
FROM eclipse-temurin:21-jre
WORKDIR /app
# Copy the fat jar (adjust target name)
COPY --from=builder /app/target/*.jar app.jar
# For prod, you will pass profile via env or command
ENV JAVA_OPTS=""
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
