package com.revysh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.revysh.service.AddService;

@Controller
public class AddController {	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam(value = "t1", required = true) int t1,@RequestParam(value = "t2", required = true) int t2) {
		AddService as = new AddService();
		int sum = as.add(t1, t2);	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", sum);
		return mv;		
	}
}