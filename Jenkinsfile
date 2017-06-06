def username = 'Jenkins'
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		echo "I said, Hello Mr. ${username}"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
		for (String i in env) {
		    echo "${i}"
		}
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