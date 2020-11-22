package net.codetojoy

import net.codetojoy.ast.*

@Marker
class TargetWithFoo {
    def go() { 
        assert this.class.declaredMethods.find { it.name == 'foo' }
        foo()
    }
}

class Runner {
    static void main(String[] args) {
        println 'TRACER cp 0'
        def target = new TargetWithFoo()
        target.go()

        def p = new Person(name: 'Mozart', address: 'Salzburg', employeeId: 1756)
        println "TRACER p: " + p.toString()

        println 'Ready.'
    }
}
