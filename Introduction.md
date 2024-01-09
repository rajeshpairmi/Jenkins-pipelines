What are Jenkin pipelines?
pipelines are a way to define a series of automated steps that make up your software delivery process such as building, testing and deployment of software.
There are 2 types of pipelines:
    - Scripted pipeline
    - Declarative pipeline

Declarative pipelines are used majorly.

What are the different phases in software lifecycle?
For example, there is a website
    - Each site has multiple features, each features has will be treated as a branch with in a project.
    - There are different types of branches - feature branches, master branch, release branch, production tags.
    - each branch has to go through th following lifecycle 
        - source code uploaded into the GITHUB
        - CI pipeline will be created in jenkins
        - Build the applicaiton 
        - Code Quality analysis integrating with jenkins
        - transfer the artifacts to repository (Artifact repository)
        - Docker build (Build image with the application artifact in application repository)
        - transfer the image to Docker hub repository.
    As part of continueous deployment:
        - deploy the image on the docker or kubernetes cluster, based on the environment dev, test, stage and prod.
        - For Dev & test environment, Continous deployment can work. 
        - For stage environment, release branch will be deployed.
        - For prod environment, tags will be deployed.

what is the syntax of the pipeline?
pipeline {
    agent
    stage(){
        steps{

        }
        # script
    }
    stage(){
        steps{

        }
    }
}   

what are the different types of pipelines?
    - pipelines
    - multibranch pipelines
    - shared libraries

familiarity with pipelines will help in other two.
pipelines:
- sandbox grooby
-file (pipelines) 
    - jenkinfiles (default)
    - any other tool
App -> githubrepo -> jenkinfile
cart 
src
pom.xml
Dockerfile
Jenkinsfile

checkout
app.py
reg.txt
templates/
dockerh
jenkins

