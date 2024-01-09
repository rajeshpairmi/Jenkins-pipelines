// This is the comment
/* 
Multi line comments
agent - will execute the pipeline with any available server (master or slave)
*/
pipeline {
    agent any # having multiple options for deploying c 
    stages {
        stage('FirstStage'){
            # Name: give the task name of the stage
            # Stage will have steps which are one or more 
            steps {
                    echo "Welcome to First Pipeline!!!!"
            }
        }
    }
}

