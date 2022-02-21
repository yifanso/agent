pipeline {
  agent none
  stages {
    stage('build') {
      steps {
        echo 'step1'
      }
    }

    stage('test') {
      steps {
        echo 'step 2'
      }
    }

    stage('deploy') {
      steps {
        sleep 100
      }
    }

    stage('consumer') {
      steps {
        echo 'usage'
      }
    }

  }
}