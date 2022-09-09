pipeline {
  agent any
  stages {
    stage('biuldproject') {
      parallel {
        stage('biuldproject') {
          steps {
            sh 'mvn clean install'
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