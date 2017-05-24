FROM java:8
VOLUME /tmp
ADD maxent-config-1.0.0-SNAPSHOT.jar config.jar
RUN sh -c 'touch /config.jar'
ENV JAVA_OPTS="-Xmx256m -Xss256k"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /config.jar" ]
