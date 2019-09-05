FROM openjdk:8-jdk

#VOLUME /etc
# ADD target/search-mvp-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/searchapi.war
#build inside the container, so we can pass this build to openshift
#laterish, split in buildtime and runtime containers using s2i
RUN apt update
RUN apt install -y maven

RUN mkdir build
WORKDIR build


# add the src
ADD pom.xml pom.xml
ADD src src

# maven is sensitive to man in the middle attacks
RUN mvn clean install 

RUN chgrp -R 0 /build && chmod -R g=u /build
RUN chgrp -R 0 /tmp && chmod -R g=u /tmp
RUN  chmod -R a+rw /tmp
RUN  chmod -R a+rw /build

#RUN  chmod -R a+rw /.javacpp
USER 10000
EXPOSE 8080

CMD java -jar target/profile2hropen-0.0.1-SNAPSHOT.jar
