FROM openjdk:21
USER 65534
LABEL org.opencontainers.image.authors="Vladislav Kuznetsov <smithy-vl@yandex.ru>"
VOLUME /tmp
ADD build/libs/pt-discord-0.0.1-SNAPSHOT.jar protego-totalum-bot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "protego-totalum-bot.jar"]