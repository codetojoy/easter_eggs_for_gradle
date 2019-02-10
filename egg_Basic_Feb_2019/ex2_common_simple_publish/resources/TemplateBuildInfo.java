
package __PACKAGE;

public class BuildInfo {
    private static final String artifact = "__ARTIFACT";
    private static final String version = "__VERSION";
    private static final String buildTimestamp = "__BUILD_TIMESTAMP";
    private static final String gitCommitInfo = "__GIT_COMMIT_INFO";

    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append("\nartifact      : " + artifact + "\n");
        buffer.append("version         : " + version + "\n");
        buffer.append("build timestamp : " + buildTimestamp + "\n");
        buffer.append("git info        : " + gitCommitInfo + "\n");

        return buffer.toString();
    }

    public static void main(String[] args) { 
        System.out.println(new BuildInfo().toString());
    }
}
