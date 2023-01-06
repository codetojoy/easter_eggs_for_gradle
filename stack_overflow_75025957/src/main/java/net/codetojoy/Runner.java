
package net.codetojoy;

import java.util.*;
import java.util.stream.*;

public class Runner {
    protected void go() {
        System.out.println("TRACER go");
    }

    public static void main(String... args) throws Exception {
        var runner = new Runner();
        runner.go();
        System.out.println("Ready.");
    }
}
