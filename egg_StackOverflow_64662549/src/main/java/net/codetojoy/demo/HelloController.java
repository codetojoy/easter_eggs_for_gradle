
package net.codetojoy.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return String.format("[%s] Greetings from Spring Boot!", new java.util.Date().toString());
	}

}
