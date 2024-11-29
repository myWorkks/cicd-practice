FROM xldevops/jdk17-lts

WORKDIR /app

COPY "target/CICDHelloworldDemo-0.0.1-SNAPSHOT.jar" .

EXPOSE  8080

ENTRYPOINT [ "/bin/bash" ]
