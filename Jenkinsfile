def username = 'Jenkins'
def cloA = {param ->
    def cloB = {
        return param * 10    
    }
}

def b = cloA(10)

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		echo "I said, Hello Mr. ${username}"
		println b(10)
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
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