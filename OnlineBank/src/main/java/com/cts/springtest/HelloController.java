package com.cts.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/page")
	public String myMsg()
	{
		return "page";
	}
}