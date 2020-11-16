
package net.codetojoy.example;

import net.codetojoy.util.Constants;

public class Example {
    public static void main(String[] args) {
        System.out.println("TRACER context path: " + Constants.CONTEXT_PATH);
        System.out.println("TRACER app properties path: " + Constants.APP_PROPERTIES_PATH);
        System.out.println("TRACER build timestamp: " + Constants.BUILD_TIMESTAMP);
        System.out.println("TRACER version: " + Constants.VERSION);
    }
}
