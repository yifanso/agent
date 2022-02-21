pipeline {
  agent none
  stages {
    stage('build') {
      steps {
        node(label: '001')
      }
    }

    stage('test') {
      steps {
        sh 'echo \'start run!\''
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