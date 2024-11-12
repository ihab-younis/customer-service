FROM tomcat:latest
ADD target/customer-service-1.0.0.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
