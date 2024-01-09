/* There are 2 different teams have below requirements
Team 1 - mvn 3.8.8 & java 11
Team 2 - mvn 3.8.8 & java 17
How do we acheive this?
1. using tools .. select mvn & java version
Tools > steps, go to manage jenkins, here we define maven versions.

*/
pipeline {
    agent any
    tools {
        maven 'CurrentMVNversion'
    }
    stages {
        stage ('maven') {
            steps {
                echo "Welcome to tools example"
                sh "mvn --version"
            }
        }

        stage('mavenwithjdk17') {
            tools {
                jdk 'jdk17'
            }
            steps {
                echo "Welcome to tools maven with jdk17"
                sh "mvn --version"
            }
        }
    }
}