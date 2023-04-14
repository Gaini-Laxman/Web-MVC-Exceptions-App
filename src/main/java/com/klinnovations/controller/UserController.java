package com.klinnovations.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	private Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/user")
	public String getWish(Model model) {
		String msgText = "Good Evening....!";

		int i = 10 / 0;

		model.addAttribute("msg", msgText);
		return "index";
	}

	
	
	/*
	 * @ExceptionHandler(value = Exception.class) //Exception- super class of any
	 * exception public String handlerAE(Exception ae) { String msg =
	 * ae.getMessage(); logger.error(msg); return "errorPage"; }
	 */

}
