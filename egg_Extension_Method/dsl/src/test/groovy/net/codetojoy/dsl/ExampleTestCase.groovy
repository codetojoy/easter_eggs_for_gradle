
package net.codetojoy.dsl

import org.junit.*
import static org.junit.Assert.*

class ExampleTestCase {
    @Test
    void testCamelCaseBasic() {
        def example = new Example()
        def s = "this is another test from dsl project"

        // test
        def result = example.useCamelCaseExtension(s)
        
        assert "thisIsAnotherTestFromDslProject" == result
    }
}
