pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Maven Build and Test') {
            steps {
                sh './mvnw clean test package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t student-application:latest .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker stop student-application-container || true'
                sh 'docker rm student-application-container || true'
                sh 'docker run -d --name student-application-container -p 8080:8080 student-application:latest'
            }
        }
    }
}