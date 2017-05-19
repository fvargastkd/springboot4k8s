FROM java:8
VOLUME /tmp
ADD k8s-demo1-1.0.0-SNAPSHOT.jar k8s-demo1.jar
RUN sh -c 'touch /k8s-demo1.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/k8s-demo1.jar"]