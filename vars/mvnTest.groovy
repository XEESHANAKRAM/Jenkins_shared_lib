def call() {
    withMaven(maven: 'Maven-3.9') {
        sh 'mvn test'
    }
}


