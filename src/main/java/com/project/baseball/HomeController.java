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
	public String nBoard(Model model) {
		return "nBoard";
	}
	
	@RequestMapping(value="/nBoard_get", method=RequestMethod.GET)
	public String nBoard(HttpServletRequest req, Model model) {
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
	
	@RequestMapping("/kBoard")
	public String kBoard(Model model) {
		return "kBoard";
	}

	@RequestMapping(value="/kBoard_get", method=RequestMethod.GET)
	public String kBoard(HttpServletRequest req, Model model) {
		System.out.println("RequestMethod.GET방식으로 폼값전송");
		
		String home_Team = req.getParameter("home_Team");
		String hBatter1 = req.getParameter("hWar1");
		String hBatter2 = req.getParameter("hWar2");
		String hBatter3 = req.getParameter("hWar3");
		String hBatter4 = req.getParameter("hWar4");
		String hBatter5 = req.getParameter("hWar5");
		String hBatter6 = req.getParameter("hWar6");
		String hBatter7 = req.getParameter("hWar7");
		String hBatter8 = req.getParameter("hWar8");
		String hBatter9 = req.getParameter("hWar9");
		String hPitcher = req.getParameter("hWar10");
		
		
		String away_Team = req.getParameter("away_Team");
		String aBatter1 = req.getParameter("aWar1");
		String aBatter2 = req.getParameter("aWar2");
		String aBatter3 = req.getParameter("aWar3");
		String aBatter4 = req.getParameter("aWar4");
		String aBatter5 = req.getParameter("aWar5");
		String aBatter6 = req.getParameter("aWar6");
		String aBatter7 = req.getParameter("aWar7");
		String aBatter8 = req.getParameter("aWar8");
		String aBatter9 = req.getParameter("aWar9");
		String aPitcher = req.getParameter("aWar10");
		
		model.addAttribute("home_Team", home_Team);
		model.addAttribute("hBatter1", hBatter1);
		model.addAttribute("hBatter2", hBatter2);		
		model.addAttribute("hBatter3", hBatter3);
		model.addAttribute("hBatter4", hBatter4);
		model.addAttribute("hBatter5", hBatter5);
		model.addAttribute("hBatter6", hBatter6);
		model.addAttribute("hBatter7", hBatter7);
		model.addAttribute("hBatter8", hBatter8);
		model.addAttribute("hBatter9", hBatter9);
		model.addAttribute("hPitcher", hPitcher);
		
		model.addAttribute("away_Team", away_Team);
		model.addAttribute("aBatter1", aBatter1);
		model.addAttribute("aBatter2", aBatter2);		
		model.addAttribute("aBatter3", aBatter3);
		model.addAttribute("aBatter4", aBatter4);
		model.addAttribute("aBatter5", aBatter5);
		model.addAttribute("aBatter6", aBatter6);
		model.addAttribute("aBatter7", aBatter7);
		model.addAttribute("aBatter8", aBatter8);
		model.addAttribute("aBatter9", aBatter9);
		model.addAttribute("aPitcher", aPitcher);
		
		
		return "kBoard_get";

	}
	
	
	@RequestMapping("/mBoard")
	public String mBoard(Model model) {
		return "mBoard";
	}
	
	
	@RequestMapping(value="/mBoard_get", method=RequestMethod.GET)
	public String mBoard(HttpServletRequest req, Model model) {
		System.out.println("RequestMethod.GET방식으로 폼값전송");
		
		String home_Team = req.getParameter("home_Team");
		String hBatter1_1 = req.getParameter("hWar1");
		String hBatter1_2 = req.getParameter("hSLG1");
		String hBatter1_3 = req.getParameter("hOBP1");
		String hBatter2_1 = req.getParameter("hWar2");
		String hBatter2_2 = req.getParameter("hSLG2");
		String hBatter2_3 = req.getParameter("hOBP2");
		String hBatter3_1 = req.getParameter("hWar3");
		String hBatter3_2 = req.getParameter("hSLG3");
		String hBatter3_3 = req.getParameter("hOBP3");
		String hBatter4_1 = req.getParameter("hWar4");
		String hBatter4_2 = req.getParameter("hSLG4");
		String hBatter4_3 = req.getParameter("hOBP4");
		String hBatter5_1 = req.getParameter("hWar5");
		String hBatter5_2 = req.getParameter("hSLG5");
		String hBatter5_3 = req.getParameter("hOBP5");
		String hBatter6_1 = req.getParameter("hWar6");
		String hBatter6_2 = req.getParameter("hSLG6");
		String hBatter6_3 = req.getParameter("hOBP6");
		String hBatter7_1 = req.getParameter("hWar7");
		String hBatter7_2 = req.getParameter("hSLG7");
		String hBatter7_3 = req.getParameter("hOBP7");
		String hBatter8_1 = req.getParameter("hWar8");
		String hBatter8_2 = req.getParameter("hSLG8");
		String hBatter8_3 = req.getParameter("hOBP8");
		String hBatter9_1 = req.getParameter("hWar9");
		String hBatter9_2 = req.getParameter("hSLG9");
		String hBatter9_3 = req.getParameter("hOBP9");
		String hPitcher1_1 = req.getParameter("hWar10");
		String hPitcher1_2 = req.getParameter("hERA1");
		String hPitcher1_3 = req.getParameter("hWHIP1");
		
		
		String away_Team = req.getParameter("away_Team");
		String aBatter1_1 = req.getParameter("aWar1");
		String aBatter1_2 = req.getParameter("aSLG1");
		String aBatter1_3 = req.getParameter("aOBP1");
		String aBatter2_1 = req.getParameter("aWar2");
		String aBatter2_2 = req.getParameter("aSLG2");
		String aBatter2_3 = req.getParameter("aOBP2");
		String aBatter3_1 = req.getParameter("aWar3");
		String aBatter3_2 = req.getParameter("aSLG3");
		String aBatter3_3 = req.getParameter("aOBP3");
		String aBatter4_1 = req.getParameter("aWar4");
		String aBatter4_2 = req.getParameter("aSLG4");
		String aBatter4_3 = req.getParameter("aOBP4");
		String aBatter5_1 = req.getParameter("aWar5");
		String aBatter5_2 = req.getParameter("aSLG5");
		String aBatter5_3 = req.getParameter("aOBP5");
		String aBatter6_1 = req.getParameter("aWar6");
		String aBatter6_2 = req.getParameter("aSLG6");
		String aBatter6_3 = req.getParameter("aOBP6");
		String aBatter7_1 = req.getParameter("aWar7");
		String aBatter7_2 = req.getParameter("aSLG7");
		String aBatter7_3 = req.getParameter("aOBP7");
		String aBatter8_1 = req.getParameter("aWar8");
		String aBatter8_2 = req.getParameter("aSLG8");
		String aBatter8_3 = req.getParameter("aOBP8");
		String aBatter9_1 = req.getParameter("aWar9");
		String aBatter9_2 = req.getParameter("aSLG9");
		String aBatter9_3 = req.getParameter("aOBP9");
		String aPitcher1_1 = req.getParameter("aWar10");
		String aPitcher1_2 = req.getParameter("aERA1");
		String aPitcher1_3 = req.getParameter("aWHIP1");
		
		model.addAttribute("home_Team", home_Team);
		model.addAttribute("hBatter1_1", hBatter1_1);
		model.addAttribute("hBatter1_2", hBatter1_2);
		model.addAttribute("hBatter1_3", hBatter1_3);
		model.addAttribute("hBatter2_1", hBatter2_1);
		model.addAttribute("hBatter2_2", hBatter2_2);
		model.addAttribute("hBatter2_3", hBatter2_3);
		model.addAttribute("hBatter3_1", hBatter3_1);
		model.addAttribute("hBatter3_2", hBatter3_2);
		model.addAttribute("hBatter3_3", hBatter3_3);
		model.addAttribute("hBatter4_1", hBatter4_1);
		model.addAttribute("hBatter4_2", hBatter4_2);
		model.addAttribute("hBatter4_3", hBatter4_3);
		model.addAttribute("hBatter5_1", hBatter5_1);
		model.addAttribute("hBatter5_2", hBatter5_2);
		model.addAttribute("hBatter5_3", hBatter5_3);
		model.addAttribute("hBatter6_1", hBatter6_1);
		model.addAttribute("hBatter6_2", hBatter6_2);
		model.addAttribute("hBatter6_3", hBatter6_3);
		model.addAttribute("hBatter7_1", hBatter7_1);
		model.addAttribute("hBatter7_2", hBatter7_2);
		model.addAttribute("hBatter7_3", hBatter7_3);
		model.addAttribute("hBatter8_1", hBatter8_1);
		model.addAttribute("hBatter8_2", hBatter8_2);
		model.addAttribute("hBatter8_3", hBatter8_3);
		model.addAttribute("hBatter9_1", hBatter9_1);
		model.addAttribute("hBatter9_2", hBatter9_2);
		model.addAttribute("hBatter9_3", hBatter9_3);
		model.addAttribute("hPitcher1_1", hPitcher1_1);
		model.addAttribute("hPitcher1_2", hPitcher1_2);
		model.addAttribute("hPitcher1_3", hPitcher1_3);

		
		model.addAttribute("away_Team", away_Team);
		model.addAttribute("aBatter1_1", aBatter1_1);
		model.addAttribute("aBatter1_2", aBatter1_2);
		model.addAttribute("aBatter1_3", aBatter1_3);
		model.addAttribute("aBatter2_1", aBatter2_1);
		model.addAttribute("aBatter2_2", aBatter2_2);
		model.addAttribute("aBatter2_3", aBatter2_3);
		model.addAttribute("aBatter3_1", aBatter3_1);
		model.addAttribute("aBatter3_2", aBatter3_2);
		model.addAttribute("aBatter3_3", aBatter3_3);
		model.addAttribute("aBatter4_1", aBatter4_1);
		model.addAttribute("aBatter4_2", aBatter4_2);
		model.addAttribute("aBatter4_3", aBatter4_3);
		model.addAttribute("aBatter5_1", aBatter5_1);
		model.addAttribute("aBatter5_2", aBatter5_2);
		model.addAttribute("aBatter5_3", aBatter5_3);
		model.addAttribute("aBatter6_1", aBatter6_1);
		model.addAttribute("aBatter6_2", aBatter6_2);
		model.addAttribute("aBatter6_3", aBatter6_3);
		model.addAttribute("aBatter7_1", aBatter7_1);
		model.addAttribute("aBatter7_2", aBatter7_2);
		model.addAttribute("aBatter7_3", aBatter7_3);
		model.addAttribute("aBatter8_1", aBatter8_1);
		model.addAttribute("aBatter8_2", aBatter8_2);
		model.addAttribute("aBatter8_3", aBatter8_3);
		model.addAttribute("aBatter9_1", aBatter9_1);
		model.addAttribute("aBatter9_2", aBatter9_2);
		model.addAttribute("aBatter9_3", aBatter9_3);
		model.addAttribute("aPitcher1_1", aPitcher1_1);
		model.addAttribute("aPitcher1_2", aPitcher1_2);
		model.addAttribute("aPitcher1_3", aPitcher1_3);
		
		
		return "mBoard_get";

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
