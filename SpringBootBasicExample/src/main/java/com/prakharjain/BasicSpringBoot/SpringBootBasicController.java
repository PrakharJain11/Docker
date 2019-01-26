package com.prakharjain.BasicSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootBasicController {
	
	@RequestMapping("/hi")
	public String sayHi()
	{
		return "Hi";
	}
}
