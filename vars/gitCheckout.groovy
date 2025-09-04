// vars/gitCheckout.groovy
def call(Map args = [:]) {
    def repo   = args.get('repo', 'https://github.com/XEESHANAKRAM/Project-9-java-hands-on.git')
    def branch = args.get('branch', 'main')

    checkout([$class: 'GitSCM',
              branches: [[name: "*/${branch}"]],
              userRemoteConfigs: [[url: repo]]])
}
