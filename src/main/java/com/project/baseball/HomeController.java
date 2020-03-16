package com.project.baseball;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "index";
	}
	
	@RequestMapping("/nBoard")
	public String helloSpring(Model model) {
		return "nBoard";
	}
	
	@RequestMapping(value="/nBoard_get", method=RequestMethod.GET)
	public String getSearch(HttpServletRequest req, Model model) {
		System.out.println("RequestMethod.GET방식으로 폼값전송");
		
		String home_Team = req.getParameter("home_Team");
		String home_WS  = req.getParameter("home_WS");
		String home_VORP = req.getParameter("home_VORP");
		String home_BPM = req.getParameter("home_BPM");
		
		String away_Team = req.getParameter("away_Team");
		String away_WS = req.getParameter("away_WS");
		String away_VORP = req.getParameter("away_VORP");
		String away_BPM = req.getParameter("away_BPM");
		
		model.addAttribute("home_Team", home_Team);
		model.addAttribute("home_WS", home_WS);
		model.addAttribute("home_VORP", home_VORP);
		model.addAttribute("home_BPM", home_BPM);
		
		model.addAttribute("away_Team", away_Team);
		model.addAttribute("away_WS", away_WS);
		model.addAttribute("away_VORP", away_VORP);
		model.addAttribute("away_BPM", away_BPM);
		
		return "nBoard_get";
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
