
package net.codetojoy.web;

public class BuildInfo {
    private static final String artifact = "simple_app";
    private static final String version = "1.0.0-RELEASE";
    private static final String buildTimestamp = "2018-Jun-11 09:22:14 AM";
    private static final String gitCommitInfo = "__GIT_COMMIT_INFO";

    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append("\nartifact      : " + artifact + "\n");
        buffer.append("version         : " + version + "\n");
        buffer.append("build timestamp : " + buildTimestamp + "\n");
        buffer.append("git info        : " + gitCommitInfo + "\n");

        return buffer.toString();
    }
}
