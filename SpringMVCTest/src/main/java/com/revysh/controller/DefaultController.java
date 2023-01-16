package com.revysh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.revysh.service.AddService;

@Controller
public class DefaultController {	
	@RequestMapping("/index")
	public ModelAndView Index() {
		return new ModelAndView("index");		
	}
}