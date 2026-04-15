pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS = 'MyDockerCredentials'
        IMAGE_NAME = 'user122sgszv/new_docker_image'
    }

    stages {

        stage('Build Java Application') {
            steps {
                bat 'javac Palindrome.java'
            }
        }

        stage('Run Java Program') {
            steps {
                bat 'java Palindrome'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %IMAGE_NAME%:latest .'
            }
        }

        stage('Login to DockerHub') {
            steps {
                withCredentials([usernamePassword(
                credentialsId: 'MyDockerCredentials',
                usernameVariable: 'USER',
                passwordVariable: 'PASS')]) {

                    bat 'echo %PASS% | docker login -u %USER% --password-stdin'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                bat 'docker push %IMAGE_NAME%:latest'
            }
        }
    }
}
