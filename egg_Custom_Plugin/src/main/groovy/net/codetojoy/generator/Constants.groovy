package net.codetojoy.generator

class Constants {
    def quickJavaContent 
    def quickTestJavaContent
    def javaGradleContent 

    def quickGroovyContent 
    def quickTestGroovyContent
    def groovyGradleContent 

    def Constants(def targetPackage) {

quickJavaContent = """
package ${targetPackage};

import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Quick {
    public int canary(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Ready.");
    }
}
"""

quickTestJavaContent = """
package ${targetPackage};

import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import org.junit.*;
import static org.junit.Assert.*;

public class QuickTestCase {
    @Test
    public void testCanary() {
        Quick quick = new Quick();

        // test
        int result = quick.canary(2,2);

        assertEquals(4, result);
    }
}
"""

javaGradleContent = """
apply plugin: 'java'

repositories {
    jcenter()
}

dependencies {
    testImplementation group: 'junit', name: 'junit', version: '4.12'
    testImplementation group: 'org.mockito', name: 'mockito-all', version: '1.10.19'
}
"""

quickGroovyContent = """
package ${targetPackage}

import java.util.concurrent.*
import java.util.regex.*

class Quick {
    int canary(int a, int b) {
        return a+b;
    }
}
"""

quickTestGroovyContent = """
package ${targetPackage}

import org.junit.*
import static org.junit.Assert.*

public class QuickTestCase {
    @Test
    void testCanary() {
        Quick quick = new Quick()

        // test
        int result = quick.canary(2,2)

        assertEquals(4, result)
    }
}
"""

groovyGradleContent = """
apply plugin: 'groovy'

repositories {
    jcenter()
}

dependencies {
    implementation group: 'org.codehaus.groovy', name: 'groovy-all', version: '2.4.5'

    testImplementation group: 'junit', name: 'junit', version: '4.12'
    testImplementation group: 'org.mockito', name: 'mockito-all', version: '1.10.19'
}
"""
    }
}
