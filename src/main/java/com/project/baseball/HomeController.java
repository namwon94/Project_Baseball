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
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody
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
			urlconnnection.setRequestProperty("Content-Type", "application.json; UTF-8");
			urlconnnection.setRequestProperty("Accept", "application/json");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlconnnection.getInputStream(),"UTF-8"));
			
			String returnLine;
			
			while((returnLine=br.readLine()) != null) {
				result.append(returnLine);
				System.out.println(br.readLine());
			}
			urlconnnection.disconnect();		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result.toString();
	}
	
	@RequestMapping("/kBoard")
	public String kBoard(Model model) {
		return "kBoard";
	}

	@RequestMapping(value="/kBoard_get.do", method=RequestMethod.GET)
	@ResponseBody
	public String kBoard(HttpServletRequest req, Model model) {
		System.out.println("RequestMethod.GET방식으로 폼값전송");

		
		float hBatter1 = Float.parseFloat(req.getParameter("home_hitter1"));
		float hBatter2 = Float.parseFloat(req.getParameter("home_hitter2"));
		float hBatter3 = Float.parseFloat(req.getParameter("home_hitter3"));
		float hBatter4 = Float.parseFloat(req.getParameter("home_hitter4"));
		float hBatter5 = Float.parseFloat(req.getParameter("home_hitter5"));
		float hBatter6 = Float.parseFloat(req.getParameter("home_hitter6"));
		float hBatter7 = Float.parseFloat(req.getParameter("home_hitter7"));
		float hBatter8 = Float.parseFloat(req.getParameter("home_hitter8"));
		float hBatter9 = Float.parseFloat(req.getParameter("home_hitter9"));
		float hPitcher = Float.parseFloat(req.getParameter("home_pitcher"));
		
		

		float aBatter1 = Float.parseFloat(req.getParameter("away_hitter1"));
		float aBatter2 = Float.parseFloat(req.getParameter("away_hitter2"));
		float aBatter3 = Float.parseFloat(req.getParameter("away_hitter3"));
		float aBatter4 = Float.parseFloat(req.getParameter("away_hitter4"));
		float aBatter5 = Float.parseFloat(req.getParameter("away_hitter5"));
		float aBatter6 = Float.parseFloat(req.getParameter("away_hitter6"));
		float aBatter7 = Float.parseFloat(req.getParameter("away_hitter7"));
		float aBatter8 = Float.parseFloat(req.getParameter("away_hitter8"));
		float aBatter9 = Float.parseFloat(req.getParameter("away_hitter9"));
		float aPitcher = Float.parseFloat(req.getParameter("away_pitcher"));
		

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
		
		
		StringBuffer result =  new StringBuffer();
		try {
			String urlstr = 
					"https://sports-predict-api-ppkcy.run.goorm.io/KBO?"
					+ "home_pitcher="+hPitcher
					+ "&home_hitter1="+hBatter1
					+ "&home_hitter2="+hBatter2
					+ "&home_hitter3="+hBatter3
					+ "&home_hitter4="+hBatter4
					+ "&home_hitter5="+hBatter5
					+ "&home_hitter6="+hBatter6
					+ "&home_hitter7="+hBatter7
					+ "&home_hitter8="+hBatter8
					+ "&home_hitter9="+hBatter9
					+ "&away_pitcher="+aPitcher
					+ "&away_hitter1="+aBatter1
					+ "&away_hitter2="+aBatter2
					+ "&away_hitter3="+aBatter3
					+ "&away_hitter4="+aBatter4
					+ "&away_hitter5="+aBatter5
					+ "&away_hitter6="+aBatter6
					+ "&away_hitter7="+aBatter7
					+ "&away_hitter8="+aBatter8
					+ "&away_hitter9="+aBatter9
					+"&";
			URL url = new URL(urlstr);
			HttpsURLConnection urlconnnection = (HttpsURLConnection)url.openConnection();
			urlconnnection.setRequestMethod("GET");
			urlconnnection.setRequestProperty("Content-Type", "application.json; UTF-8");
			urlconnnection.setRequestProperty("Accept", "application/json");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlconnnection.getInputStream(),"UTF-8"));
			
			String returnLine;
			
			while((returnLine=br.readLine()) != null) {
				result.append(returnLine);
				System.out.println(br.readLine());
			}
			urlconnnection.disconnect();		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result.toString();

	}
	
	
	@RequestMapping("/mBoard")
	public String mBoard(Model model) {
		return "mBoard";
	}
	
	
	@RequestMapping(value="/mBoard_get", method=RequestMethod.GET)
	@ResponseBody
	public String mBoard(HttpServletRequest req, Model model) {
		System.out.println("RequestMethod.GET방식으로 폼값전송");
		
		float home_OBP = Float.parseFloat(req.getParameter("home_OBP"));
		float home_SLG = Float.parseFloat(req.getParameter("home_SLG"));
		float home_WAR_b = Float.parseFloat(req.getParameter("home_WAR_b"));
		float home_ERA = Float.parseFloat(req.getParameter("home_ERA"));
		float home_WHIP = Float.parseFloat(req.getParameter("home_WHIP"));
		float home_WAR_p = Float.parseFloat(req.getParameter("home_WAR_p"));

		
		
		float away_OBP = Float.parseFloat(req.getParameter("away_OBP"));
		float away_SLG = Float.parseFloat(req.getParameter("away_SLG"));
		float away_WAR_b = Float.parseFloat(req.getParameter("away_WAR_b"));
		float away_ERA = Float.parseFloat(req.getParameter("away_ERA"));
		float away_WHIP = Float.parseFloat(req.getParameter("away_WHIP"));
		float away_WAR_p = Float.parseFloat(req.getParameter("away_WAR_p"));

		
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

		
		
		StringBuffer result =  new StringBuffer();
		try {
			String urlstr = 
					"https://sports-predict-api-ppkcy.run.goorm.io/MLB?"
					+ "home_OBP="+home_OBP
					+ "&home_SLG="+home_SLG
					+ "&home_WAR_b="+home_WAR_b
					+ "&away_OBP="+away_OBP
					+ "&away_SLG="+away_SLG
					+ "&away_WAR_b="+away_WAR_b
					+ "&home_WHIP="+home_WHIP
					+ "&home_ERA="+home_ERA
					+ "&home_WAR_p="+home_WAR_p
					+ "&away_WHIP="+away_WHIP
					+ "&away_ERA="+away_ERA
					+ "&away_WAR_p="+away_WAR_p;
			URL url = new URL(urlstr);
			HttpsURLConnection urlconnnection = (HttpsURLConnection)url.openConnection();
			urlconnnection.setRequestMethod("GET");
			urlconnnection.setRequestProperty("Content-Type", "application.json; UTF-8");
			urlconnnection.setRequestProperty("Accept", "application/json");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlconnnection.getInputStream(),"UTF-8"));
			
			String returnLine;
			
			while((returnLine=br.readLine()) != null) {
				result.append(returnLine);
				System.out.println(br.readLine());
			}
			urlconnnection.disconnect();		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result.toString();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
