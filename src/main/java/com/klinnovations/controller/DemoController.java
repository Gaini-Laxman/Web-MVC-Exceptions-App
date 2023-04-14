package com.klinnovations.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	private Logger logger = LoggerFactory.getLogger(DemoController.class);

	@GetMapping("/greet")
	public String getGreet(Model model) {
		String msgText = "WelCome To KLIT....!";
		model.addAttribute("msg", msgText);
		return "index";
	
	}
	
	@GetMapping("/wish")
	public String getWish(Model model) {
		String msgText = "Good Evening....!";

		//int i = 10 / 0;
		String s = null;
		s.length();
		model.addAttribute("msg", msgText);
		return "index";
	}

	//@ExceptionHandler(value = ArithmeticException.class) local exception
	
	/*
	 * @ExceptionHandler(value = Exception.class) //Exception- super class of any
	 * exception public String handlerAE(Exception ae) { String msg =
	 * ae.getMessage(); logger.error(msg); return "errorPage"; }
	 */

}
