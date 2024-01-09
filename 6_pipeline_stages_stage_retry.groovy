// writing script to perform retries on exception
// retry syntax - retry() { code block }

pipeline {
    agent any
    stages {
        stage(retrytesting) {
            steps {
                retry (3) {
                    def 
                    echo "Hello World, retrying script"
                    error "execption occured"
                }
                
                echo "Printing after 3 retries"
            }
        }
    }
}