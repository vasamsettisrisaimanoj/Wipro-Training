//package com.company.controller;
package com.company.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class HomeController {

	
	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("This is home URL");
		model.addAttribute("name", "Jaya Aditya");
		model.addAttribute("Designation", "Student");
		return "index";  //Return view page and view resolver will resolve this page
	}
}


// 