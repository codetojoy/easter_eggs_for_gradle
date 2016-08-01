
package net.codetojoy.ext

import org.junit.*
import static org.junit.Assert.*

class CamelCaseExtensionTestCase {
    @Test
    void testBasic() {
        def s = "this is a test"

        // test
        def result = CamelCaseExtension.camelCase(s)

        assert "thisIsATest"
    }
}
