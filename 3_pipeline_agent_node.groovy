//node:in node also we need to mention the label, however we can execute steps in the custom workspace
//none: no agent will be available for the job to run by default, agent has to be mentioned at the stage level rather at the pipeline level to excute the steps in the stage
//let test both the usecases below
pipeline {
    agent none //not defining any agent here, agent has to be defined at the stage level.
    stages {
        stage (print_custom_content) {
            agent { //agent any or none or {} is allowed
                 node {
                    label 'mvn-slave'
                    customWorkspace '/home/rajesh/customWorkspace'
                }
            }
        
            steps {
                echo 'Welcome to new Workspace, below command execting from new workspace'
                sh 'hostname -i'
                sh 'cat file.txt'
            }
        }
    }
}