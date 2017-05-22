FROM java:8
VOLUME /tmp
ADD maxent-discovery-1.0.0-SNAPSHOT.jar discovery.jar
RUN sh -c 'touch /discovery.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/discovery.jar"]