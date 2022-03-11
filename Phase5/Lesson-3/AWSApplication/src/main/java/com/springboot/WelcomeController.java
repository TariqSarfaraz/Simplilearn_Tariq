package com.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@ResponseBody
	@RequestMapping("/")
	public String show()
	{
		return "WELCOME";
	}
}
