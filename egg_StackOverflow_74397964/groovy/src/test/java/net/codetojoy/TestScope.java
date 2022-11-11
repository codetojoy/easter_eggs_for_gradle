
package net.codetojoy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
*/
import jdk.incubator.concurrent.*;

class CustomStructuredTaskScope<T> extends StructuredTaskScope<T> {
}

public class TestScope {
	@Test
	void addsTwoNumbers() {
        // test 
		var x = 4 + 4;

		assertEquals(8, x);
	}
}
