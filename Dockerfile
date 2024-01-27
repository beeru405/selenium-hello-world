FROM tomcat:latest

COPY target/your-web-project.war /usr/local/tomcat/webapps/
