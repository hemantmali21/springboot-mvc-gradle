package com.hemant.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

	
@RestController
public class HelloController {

	
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView dashboard() {
    	ModelAndView model = new ModelAndView();
    	model.addObject("message", "Spring boot mvc");
    	model.setViewName("home");
    	return model;
    }
    
    @RequestMapping(value = "/welcome1", method = RequestMethod.GET)
    public String sayHi(ModelMap model){
    	model.put("message", "Spring ---------");
    	return "home2";
    }

}
