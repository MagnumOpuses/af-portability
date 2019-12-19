FROM openjdk:13-alpine

ARG SPRING_PROFILE_URL=http://af-connect.local:9998/arbetssokandeprofil/rest/af/v1/arbetssokandeprofil/arbetssokandeprofiler
ARG SPRING_KUNDGIFT_URL=http://af-connect.local:9998/arbetssokande/rest/af/v1/arbetssokande/externa-personuppgifter
ARG SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/apimanager
ARG SPRING_OUTBOX_HOST=127.0.0.1



ENV spring.profile.url=$SPRING_PROFILE_URL
ENV spring.kundgift.url=$SPRING_KUNDGIFT_URL
ENV spring.datasource.url=$SPRING_DATASOURCE_URL
ENV spring.outbox.host=$SPRING_OUTBOX_HOST
#VOLUME /etc
# ADD target/search-mvp-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/searchapi.war
#build inside the container, so we can pass this build to openshift
#laterish, split in buildtime and runtime containers using s2i


RUN apk update
RUN apk add maven
RUN apk add wget
RUN mkdir build
WORKDIR build


# add the src
COPY pom.xml pom.xml
COPY src/ src

# maven is sensitive to man in the middle attacks
RUN mvn install -DskipTests

RUN chgrp -R 0 /build && chmod -R g=u /build
RUN chgrp -R 0 /tmp && chmod -R g=u /tmp
RUN  chmod -R a+rw /tmp
RUN  chmod -R a+rw /build

#RUN  chmod -R a+rw /.javacpp
USER 10000
EXPOSE 8080
WORKDIR /build/target
CMD java -jar ./profile2hropen-*-SNAPSHOT.jar
