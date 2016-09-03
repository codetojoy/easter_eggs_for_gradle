
import org.gradle.tooling.*
import org.gradle.tooling.model.*

class BuildRunner implements Runnable {
    def connector
    def tokenSource
    def taskName

    BuildRunner(connector, tokenSource, taskName) {
        this.connector = connector
        this.tokenSource = tokenSource
        this.taskName = taskName
    }

    public void run() {
        def connection = connector.connect()        
        try {            
            def build = connection.newBuild()
            build.withCancellationToken(tokenSource.token())
            build.setStandardOutput(System.out)
            build.setStandardError(System.err)
            build.forTasks(taskName)
            build.run()
            println "${taskName} is finishing ..."
        } catch(BuildCancelledException bcex) {
            println "received cancel signal"
            println "tickling daemon ..."
            tickleDaemon(connector)
            println "Done."
            System.exit(0)
        } catch(Exception ex) {
            println "caught exception : " + ex
        } finally {            
          connection.close()        
        }        
    }

    def tickleDaemon = { connector ->
        final String TASKS = "tasks"
        def connection = connector.connect()        
        def build = connection.newBuild()
        build.forTasks(TASKS)
        build.run()
    }
}

// main -----------

// edit as appropriate
final String TASK_NAME = "runService"
final String GRADLE_INSTALL_DIR = "/Users/measter/tools/gradle-2.14.1"
final String PROJECT_DIR = "../service"

def connector = GradleConnector.newConnector()
connector.useInstallation(new File(GRADLE_INSTALL_DIR))
connector.forProjectDirectory(new File(PROJECT_DIR))

def tokenSource = connector.newCancellationTokenSource()

println "starting ${TASK_NAME}"
def buildRunner = new BuildRunner(connector, tokenSource, TASK_NAME)
new Thread(buildRunner).start()

def console = new Scanner(System.in)
println "Enter a command (S: stop task, Q: quit): "

while (console.hasNextLine()) {
    def lineTokenizer = new Scanner(console.nextLine())
    String token = lineTokenizer.next()
    if (token.equalsIgnoreCase("S")) {
        tokenSource.cancel()
    } else if (token.equalsIgnoreCase("Q")) {
        println "Done."
        System.exit(0)
    }
}

