pipeline {
    agent any
    tools {
        maven 'maven-3.9.4' 
    }
    environment {
        BACK_DOCKER_IMAGE = "khouloudsd/springboot-app"
        FRONT_DOCKER_IMAGE = "khouloudsd/angular-app"
    }
    stages {
        stage('Checkout SCM') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/KhouloudSD/DockerJenkinsKubernetesPipeline.git']])  
            }
        }
        stage('Build Maven') {
            steps {
                dir('internV1-SBOOT') {
                    sh 'mvn clean install'
                }
            }
            post {
                success {
                    echo "Success: Maven build completed"
                }
                failure {
                    echo "Failed: Maven build"
                }
            }
        }
        
        stage('Build Docker Images') {
            steps {
                script {
                    dir('internV1-SBOOT') {
                        // Build your Docker image
                        def dockerImageBack = docker.build("${BACK_DOCKER_IMAGE}", ".")

                    }}
            }
        }
        stage('push image to hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub_pwd', variable: 'Dockerhub-pwd')]) {
                       sh 'docker login -u khouloudsd -p ${Dockerhub-pwd}'
}
                }
                sh 'docker push ${BACK_DOCKER_IMAGE}'
            }
            
        }
       
        
        }
          
    }
    
