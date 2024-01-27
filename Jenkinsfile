pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    sh 'cp target/your-web-project.war /path/to/tomcat/webapps/'
                }
            }
        }
    }
}
