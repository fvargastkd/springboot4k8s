FROM java:8
VOLUME /tmp
ADD maxent-admin-1.0.0-SNAPSHOT.jar maxent-admin.jar
RUN sh -c 'touch /maxent-admin.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/maxent-admin.jar"]
