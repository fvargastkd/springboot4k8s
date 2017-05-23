FROM java:8
VOLUME /tmp
ADD maxent-gateway-1.0.0-SNAPSHOT.jar maxent-gateway.jar
RUN sh -c 'touch /maxent-gateway.jar'
ENV JAVA_OPTS="-Xmx256m -Xss256k"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /maxent-gateway.jar" ]
