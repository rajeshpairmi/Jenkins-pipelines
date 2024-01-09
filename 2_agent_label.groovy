// agent {label } - This label helps to identify appropriate slave to execute the stages, agent can be configured at global level or at east share with agent option.
pipeline {
    agent {
        label 'mvn-slave'
    }
    stages {
        stage(hostname) {
            steps {
                sh 'hostname -i'
            }
        }
    }
}