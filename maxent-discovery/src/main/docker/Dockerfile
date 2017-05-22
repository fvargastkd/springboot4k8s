FROM java:8
VOLUME /tmp
ADD maxent-discovery-1.0.0-SNAPSHOT.jar maxent-discovery.jar
RUN sh -c 'touch /maxent-discovery.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/maxent-discovery.jar"]
