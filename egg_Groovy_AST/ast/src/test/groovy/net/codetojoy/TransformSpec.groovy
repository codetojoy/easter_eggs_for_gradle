package net.codetojoy.ast

import spock.lang.Specification

class TransformSpec extends Specification {
    def 'transform adds method'() {
        given:
        String classString = '''
import net.codetojoy.ast.*

@Marker
class Test { }

new Test()
'''
        when:
        def instance = new GroovyShell().evaluate(classString)
        def fooMethod = instance.class.declaredMethods.find { it.name == 'foo' }

        then:
        fooMethod
    }
}
