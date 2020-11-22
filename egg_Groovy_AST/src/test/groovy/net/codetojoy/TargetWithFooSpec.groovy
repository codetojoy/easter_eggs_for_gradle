package net.codetojoy

import spock.lang.Specification

import java.lang.reflect.Method

class TargetWithFooSpec extends Specification {
    def 'transform adds foo() to TargetWithFoo'() {
        when:
        def instance = new TargetWithFoo()
        def fooMethod = instance.class.declaredMethods.find { it.name == 'foo' }

        then:
        fooMethod
    }
}
