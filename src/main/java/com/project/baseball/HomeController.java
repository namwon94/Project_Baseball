package com.project.baseball;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.net.ssl.HttpsURLConnection;
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

		float home_WS  = Float.parseFloat(req.getParameter("home_WS"));
		float home_VORP = Float.parseFloat(req.getParameter("home_VORP"));
		float home_BPM = Float.parseFloat(req.getParameter("home_BPM"));
		
		float away_WS = Float.parseFloat(req.getParameter("away_WS"));
		float away_VORP = Float.parseFloat(req.getParameter("away_VORP"));
		float away_BPM = Float.parseFloat(req.getParameter("away_BPM"));
		
		model.addAttribute("home_WS", home_WS);
		model.addAttribute("home_VORP", home_VORP);
		model.addAttribute("home_BPM", home_BPM);
		
		model.addAttribute("away_WS", away_WS);
		model.addAttribute("away_VORP", away_VORP);
		model.addAttribute("away_BPM", away_BPM);
		
		StringBuffer result =  new StringBuffer();
		try {
			String urlstr = "https://sports-predict-api-ppkcy.run.goorm.io//" 
					 + "NBA?home_BPM="+home_BPM
					 + "&away_BPM="+away_BPM 
					 + "&home_VORP="+home_VORP 
					 + "&away_VORP="+away_VORP 
					 +"&home_WS="+home_WS
					 + "&away_WS="+away_WS;
			URL url = new URL(urlstr);
			HttpsURLConnection urlconnnection = (HttpsURLConnection)url.openConnection();
			urlconnnection.setRequestMethod("GET");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlconnnection.getInputStream(),"UTF-8"));
			
			String returnLine;
			
			while((returnLine=br.readLine())!=null) {
				result.append(returnLine);
				System.out.println(br.readLine());
			}
			urlconnnection.disconnect();		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return "nBoard_get";
	}
	
	@RequestMapping("/kBoard")
	public String kBoard(Model model) {
		return "kBoard";
	}

	@RequestMapping(value="/kBoard_get", method=RequestMethod.GET)
	public String kBoard(HttpServletRequest req, Model model) {
		System.out.println("RequestMethod.GET방식으로 폼값전송");

		
		String hBatter1 = req.getParameter("home_hitter1");
		String hBatter2 = req.getParameter("home_hitter2");
		String hBatter3 = req.getParameter("home_hitter3");
		String hBatter4 = req.getParameter("home_hitter4");
		String hBatter5 = req.getParameter("home_hitter5");
		String hBatter6 = req.getParameter("home_hitter6");
		String hBatter7 = req.getParameter("home_hitter7");
		String hBatter8 = req.getParameter("home_hitter8");
		String hBatter9 = req.getParameter("home_hitter9");
		String hPitcher = req.getParameter("home_pitcher");
		
		

		String aBatter1 = req.getParameter("away_hitter1");
		String aBatter2 = req.getParameter("away_hitter2");
		String aBatter3 = req.getParameter("away_hitter3");
		String aBatter4 = req.getParameter("away_hitter4");
		String aBatter5 = req.getParameter("away_hitter5");
		String aBatter6 = req.getParameter("away_hitter6");
		String aBatter7 = req.getParameter("away_hitter7");
		String aBatter8 = req.getParameter("away_hitter8");
		String aBatter9 = req.getParameter("away_hitter9");
		String aPitcher = req.getParameter("away_pitcher");
		

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
		
		String home_OBP = req.getParameter("home_OBP");
		String home_SLG = req.getParameter("home_SLG");
		String home_WAR_b = req.getParameter("home_WAR_b");
		String home_ERA = req.getParameter("home_ERA");
		String home_WHIP = req.getParameter("home_WHIP");
		String home_WAR_p = req.getParameter("home_WAR_p");

		
		
		String away_OBP = req.getParameter("away_OBP");
		String away_SLG = req.getParameter("away_SLG");
		String away_WAR_b = req.getParameter("away_WAR_b");
		String away_ERA = req.getParameter("away_ERA");
		String away_WHIP = req.getParameter("away_WHIP");
		String away_WAR_p = req.getParameter("away_WAR_p");

		
		model.addAttribute("home_OBP", home_OBP);
		model.addAttribute("home_SLG", home_SLG);
		model.addAttribute("home_WAR_b", home_WAR_b);
		model.addAttribute("home_ERA", home_ERA);
		model.addAttribute("home_WHIP", home_WHIP);
		model.addAttribute("home_WAR_p", home_WAR_p);

		model.addAttribute("away_OBP", away_OBP);
		model.addAttribute("away_SLG", away_SLG);
		model.addAttribute("away_WAR_b", away_WAR_b);
		model.addAttribute("away_ERA", away_ERA);
		model.addAttribute("away_WHIP", away_WHIP);
		model.addAttribute("away_WAR_p", away_WAR_p);

		
		
		return "mBoard_get";

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
