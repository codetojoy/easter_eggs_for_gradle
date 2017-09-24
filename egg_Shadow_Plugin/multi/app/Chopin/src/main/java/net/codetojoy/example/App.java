
package net.codetojoy.example;

import net.codetojoy.liba.A_Utils;
import net.codetojoy.libb.B_Utils;

import org.joda.time.DateTime;

public class App {
    public static void main(String[] args) {
        System.out.println("TRACER Chopin");
        System.out.println("TRACER time: " + new DateTime());

        System.out.println("TRACER " + A_Utils.prefix("hello"));
        System.out.println("TRACER " + B_Utils.prefix("there"));

        System.out.println("Ready.");
    }
}
