pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/Shashank-1202/Terraform-with-docker.git'
            }
        }
        stage('Build') {
            steps {
                sh 'echo build Stage run'
            }
        }
        stage('Test') {
            steps {
                sh 'echo Testing Project seccesfully'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo Hureeyyy Deploy'
            }
        }
    }
}
