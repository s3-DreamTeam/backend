pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'Building'
        dir(path: 'snacky-backend/snacky-backend/') {
          sh './gradlew build'
        }

        echo 'Building done'
      }
    }

    stage('Dockerize') {
      steps {
        echo 'Dockerizing'
        sh 'docker build -f src/main/docker/Dockerfile.jvm -t snacky-backend .'
        echo 'docker image built'
        sh 'docker save -o docker/test/snacky-backend.tar snacky-backend:latest'
        echo 'image saved to file'
        echo 'Dockerizing done'
      }
    }

  }
}