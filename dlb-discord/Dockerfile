FROM eclipse-temurin:17-jdk-alpine
MAINTAINER Vladislav Kuznetsov <smithy-vl@yandex.ru>
VOLUME /tmp
ADD build/libs/dlb-discord-2023.1.jar discord-leo-bot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "discord-leo-bot.jar"]