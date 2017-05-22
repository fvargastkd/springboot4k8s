FROM java:8
VOLUME /tmp
ADD maxent-gateway-1.0.0-SNAPSHOT.jar maxent-gateway.jar
RUN sh -c 'touch /maxent-gateway.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/maxent-gateway.jar"]
