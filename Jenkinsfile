library identifier: 'SharedFly@master', retriever: modernSCM([$class: 'GitSCMSource', credentialsId: '', remote: 'https://github.com/virnahar/Jenkins-SharedLibrary.git', traits: [gitBranchDiscovery()]])
 
pipeline {
    agent any
    stages {
        stage('mail') {
            steps {
            extendmail(
             
                subject: "This is the subject from job itself", to: "virnahar@gmail.com"
            )
            }
    }
    }
}
