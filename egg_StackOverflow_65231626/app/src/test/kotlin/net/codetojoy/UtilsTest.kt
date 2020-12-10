package net.codetojoy

import net.codetojoy.TestUtils

import kotlin.test.assertEquals
import org.junit.*

class UtilsTestSource() {
    val utils = Utils()
    val testUtils = TestUtils()

    @Test fun testAdd() {
        val x = 2573
        val y = 2577

        // use testlib:
        val tmp = testUtils.testFoo(x, y)
        println("TRACER tmp: " + tmp)

        // test
        val result = utils.add(x, y)

        assertEquals(5150, result)
    }
}

