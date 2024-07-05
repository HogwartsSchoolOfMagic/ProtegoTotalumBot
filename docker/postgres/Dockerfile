FROM postgres:16-alpine
USER 65534
RUN localedef -i ru_RU -c -f UTF-8 -A /usr/share/locale/locale.alias ru_RU.UTF-8
ENV LANG ru_RU.utf8

#COPY create_schemas.sql /docker-entrypoint-initdb.d/