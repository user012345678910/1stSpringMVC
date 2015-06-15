package com.firstlession.src;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//Request Param way ?elephentsize=99&milk=98
	
/*	@RequestMapping(value = "index.htm", method=RequestMethod.GET)
	public String bloop(Model model, @RequestParam String milk){
		model.addAttribute("milkvalue", milk);
		return "home";
	}*/
	
	//Restful Way : elephantsize/99/milk/98 updated
	@RequestMapping(value = "index.htm/milk/{milk}", method=RequestMethod.GET)
	public String bloop(Model model, @PathVariable String milk){
		model.addAttribute("milkvalue", milk);
		return "home";
	}
	
/*	@RequestMapping(value = "index.htm/one", method=RequestMethod.GET)
	public String bloop(Model model, @RequestParam String winner){
		model.addAttribute("player", winner);
		return "home";
	}	
	
	@RequestMapping(value = "index.htm/two", method=RequestMethod.GET)
	public String bloop2(Model model){
		
		return "home2";
	}*/
}
