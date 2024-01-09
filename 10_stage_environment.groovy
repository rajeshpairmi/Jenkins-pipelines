/* environment directive specifies a sequence of key-value pairs which will be
defined as environment variables for all steps or stage-specific steps, depends on where the evironment directive is located within 
the pipeline.
This environment block can be used at pipeline level or at the stage level.
syntax:
*/
pipeline {
    agent any
    environment {
        //key-value pairs
        name = "Siva"
        course = "k8s"
    }
    stages {
        stage('Build') {
            // environment variables defined at stage level, these env will be applied throughout the stage and nothing outside the stage where as env variable at pipeline level can be utilized at any stage in the pipeline.
            environment {
                cloud = "GCP"
            }
            steps {
                echo "Welcome ${name}"
                echo "You enrolled to $(course) Course"
                echo "You are certified in $(cloud)"
            }
        }
    }
}