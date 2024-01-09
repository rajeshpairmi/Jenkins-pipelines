pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                timeout (time: 5, unit: 'SECONDS') {
                    //block code 
                    echo "Sleeping for 60 seconds"
                    sleep 60
                }
                
            }
        }
    }
}