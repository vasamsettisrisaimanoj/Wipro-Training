package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/api")
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
    public String home(Model model) {
        System.out.println("This is home URL");
        model.addAttribute("name", "Niti Dwivedi");
        model.addAttribute("designation", "Trainer"); // use lowercase key
        return "index";  // View resolver will return index.jsp or index.html
    }
}
