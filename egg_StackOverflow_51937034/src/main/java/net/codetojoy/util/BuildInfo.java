
package net.codetojoy.util;

public class BuildInfo {
    private static final String version = "1.0.0";
    private static final String buildTimestamp = "Mon Aug 20 19:06:34 ADT 2018";

    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append("version         : " + version + "\n");
        buffer.append("build timestamp : " + buildTimestamp + "\n");

        return buffer.toString();
    }
}
