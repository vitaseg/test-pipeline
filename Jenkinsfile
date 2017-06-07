def asd = "hi"
String fullComponentVersion = null
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building.. ${env.BUILD_NUMBER}"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		echo "Running ${env.BUILD_ID} on ${env.BUILD_URL}"
	    }
        }
        stage('Deploy') {
            when {
              expression {
                currentBuild.result == null || currentBuild.result == 'SUCCESS' 
              }
            }
            steps {
                sh 'ls -la'
            }
        }
    }
}