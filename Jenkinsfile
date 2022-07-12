pipeline {
  agent any
  parameters {
        booleanParam(name: 'android', defaultValue: true, description: '')
        booleanParam(name: 'ios', defaultValue: true, description: '')
        booleanParam(name: 'en_BR', defaultValue: true, description: '')
        booleanParam(name: 'en_KW', defaultValue: false, description: '')
        string(name: 'releaseVersion', defaultValue: '5.10.0', description: 'needs to match suite job')
        choice(name: 'filterTests', choices: ['smoke', 'debug', 'all'], description: 'specific test configurations')
        choice(name: 'environment', choices: ['mock.remote'], description: 'test environment')
        booleanParam(name: 'verifyStrings', defaultValue: false, description: 'download and verify strings against loom')
  }
  stages {
    stage('error') {
      steps {
        echo 'Hello world'
      }
    }

  }
}
