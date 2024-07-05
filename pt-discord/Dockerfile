FROM eclipse-temurin:21-jdk-alpine
MAINTAINER Vladislav Kuznetsov <smithy-vl@yandex.ru>
VOLUME /tmp
ADD build/libs/pt-discord-2024.1.jar protego-totalum-bot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "discord-leo-bot.jar"]