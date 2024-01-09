// custom requirement such as scripts where we run the conditions and customizations
// script block is available in steps, if we are having complex environment, we use scipts under steps. 
// There are workflow-basic-steps commands such as sleep, stash .. 

pipeline {
    agent any
    stages {
        stage("Hello") {
            steps {
                echo 'Hello World!!'
                
            }
        }
        stage("script") {
            steps {
                script {
                    def course = "k8s" //static variable defination 
                    if (course == "k8s") {
                        println ("Thanks for enrolling to ${course}")
                    }
                    else 
                        println("Do enroll")
                }  
            }
        }
    }
}