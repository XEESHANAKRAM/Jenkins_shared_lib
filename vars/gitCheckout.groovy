def call(Map args = [:]) {
    checkout([$class: 'GitSCM',
        branches: [[name: args.branch ?: '*/main']],
        extensions: [[$class: 'WipeWorkspace']],
        userRemoteConfigs: [[url: args.repo]]
    ])
}
