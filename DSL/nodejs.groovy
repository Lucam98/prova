job('prova') {
    scm {
        git('git://p4fuser@bitbucket.org/p4fuser/jenkins.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Luca')
            node / gitConfigEmail('luca@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('prova') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("./prova.sh")
    }
}
