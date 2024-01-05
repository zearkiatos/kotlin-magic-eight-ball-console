FROM gradle:8.2-jdk11 as build

RUN mkdir -p /home/gradle/src
WORKDIR /home/gradle/src
COPY . /home/gradle/src
RUN ./gradlew --no-daemon shadowJar

FROM openjdk:11.0.1-jre

COPY --from=build /home/gradle/src/build/libs/app.jar /bin/runner/run.jar
WORKDIR /bin/runner

CMD ["java","-jar","run.jar"]