// Jenkins by default runs the pipeline once the scan is completed.


pipeline {
    agent any
    stages {
        stage(build) {
            steps {
                echo "This is build stage"
            }
        }
        stage(test) {
            steps {
                echo "This is test phase"
            }
        }
    }
}