FROM java:8

ADD target/blog-post-service-1.0-SNAPSHOT.jar /data/bps/blog-post-service-1.0-SNAPSHOT.jar
ADD target/classes/DEV-config.yml /data/bps/classes/DEV-config.yml
ADD target/classes/QA-config.yml /data/bps/classes/QA-config.yml
ADD target/classes/LIVE-config.yml /data/bps/classes/LIVE-config.yml
EXPOSE 7001
