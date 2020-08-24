pipeline {
         agent any
         stages {
                 stage('One') {
                 steps {
                     echo 'Hi, this is 19MCA8089'
                 }
                 }
                 stage('Two') {
                 steps {
                    input('Do you want to proceed?')
                 }
                 }
                 stage('Three') {
                 when {
                       not {
                            branch "master"
                       }
                 }
                 steps {
                       echo "Hello Jenkins"
                 }
                 }
                 stage('Four') {
                 parallel { 
                            stage('Unit Test') {
                           steps {
                                echo "Running the unit test..."
                           }
                           }
                            stage('Integration test') {
                                steps {
                                echo "Running the integration test..."
                              }
                           }
                           }
                           }
              }
}
