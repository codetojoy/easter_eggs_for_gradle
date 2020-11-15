
package net.codetojoy

import kotlin.test.assertEquals
import org.junit.*

class UtilsTestSource() {
    val utils = Utils()

    @Test fun testAdd() {
        val x = 2573
        val y = 2577

        // test
        val result = utils.add(x, y)

        assertEquals(5150, result)
    }
}
