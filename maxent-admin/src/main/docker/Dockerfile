FROM java:8
VOLUME /tmp
ADD maxent-admin-1.0.0-SNAPSHOT.jar maxent-admin.jar
RUN sh -c 'touch /maxent-admin.jar'
ENV JAVA_OPTS="-Xmx256m -Xss256k"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /maxent-admin.jar" ]
