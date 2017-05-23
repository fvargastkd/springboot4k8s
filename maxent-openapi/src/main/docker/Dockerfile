FROM java:8
VOLUME /tmp
ADD maxent-openapi-1.0.0-SNAPSHOT.jar openapi.jar
RUN sh -c 'touch /openapi.jar'
ENV JAVA_OPTS="-Xmx256m -Xss256k"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /openapi.jar" ]
