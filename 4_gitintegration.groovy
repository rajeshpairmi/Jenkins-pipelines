//scenerio: Need to clone a repository from github branch main
pipeline {
    agent none
    stages {
        stage(customWorkspace) {
            agent {
                node {
                    label "mvn-slave"
                    customWorkspace "/home/rajesh/customWorkspace"
                }    
            }

            steps {
                echo "Download content from github main branch to ${hostname}"
                git branch: 'main', url: 'https://github.com/rajeshpairmi/spring-petclinic.git'
            }
        }
    }
}