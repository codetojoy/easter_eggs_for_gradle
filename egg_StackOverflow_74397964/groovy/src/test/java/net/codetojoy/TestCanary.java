
package net.codetojoy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCanary {
	@Test
	void addsTwoNumbers() {
        // test 
		var x = 4 + 4;

		assertEquals(8, x);
	}
}
