
package __PACKAGE;

public class BuildInfo {
    private static final String version = "__VERSION";
    private static final String buildTimestamp = "__BUILD_TIMESTAMP";

    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append("version         : " + version + "\n");
        buffer.append("build timestamp : " + buildTimestamp + "\n");

        return buffer.toString();
    }
}
