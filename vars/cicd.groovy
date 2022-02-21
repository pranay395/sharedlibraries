def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(qa)
{
  "deploy adapters: [tomcat9(credentialsId: '8be0084a-4288-40dc-9634-fc085c98e8fc', path: '', url: 'http://172.31.21.191:8080')], contextPath: 'test1', war: '**/*.war'"
}
def runSelenium(path)
{
  sh "java -jar ${path}/testing.jar"
}
def newDeploy(prod)
{
  "deploy adapters: [tomcat9(credentialsId: '8be0084a-4288-40dc-9634-fc085c98e8fc', path: '', url: 'http://172.31.24.74:8080')], contextPath: 'prod1', war: '**/*.war'"
}
