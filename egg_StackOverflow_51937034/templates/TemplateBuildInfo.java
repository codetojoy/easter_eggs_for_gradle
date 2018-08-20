
package __PACKAGE;

public class BuildInfo {
    private static final String version = "__VERSION";
    private static final String buildTimestamp = "__BUILD_TIMESTAMP";

    public String toString() {
        return "version         : " + version + "\n" + 
               "build timestamp : " + buildTimestamp + "\n";
    }
}
