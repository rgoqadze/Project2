pipeline {
  agent any
  stages {
    stage('biuldproject') {
      parallel {
        stage('biuldproject') {
          steps {
            sh 'mvn start'
          }
        }

        stage('maven version') {
          steps {
            sh 'mvn --version'
          }
        }

      }
    }

  }
}