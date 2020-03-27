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
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "index";
	}
	
	
	
	
// NBA게시판으로 이동
	@RequestMapping("/nBoard")
	public String nBoard(Model model) {
		return "nBoard";
	}
// NBA게시판에서 데이터 값 전송
	@RequestMapping(value="/nBoard_get", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView sendGetNBA(HttpServletRequest req) {
		System.out.println("RequestMethod.GET방식으로 폼값전송");
		
		ModelAndView mv = new ModelAndView();
// 데이터 입력
		float home_WS  = Float.parseFloat(req.getParameter("home_WS"));
		float home_VORP = Float.parseFloat(req.getParameter("home_VORP"));
		float home_BPM = Float.parseFloat(req.getParameter("home_BPM"));
		
		float away_WS = Float.parseFloat(req.getParameter("away_WS"));
		float away_VORP = Float.parseFloat(req.getParameter("away_VORP"));
		float away_BPM = Float.parseFloat(req.getParameter("away_BPM"));
// 파라미터 전송(API 이용)
		try {
			String urlstr = "https://sports-predict-api-ppkcy.run.goorm.io//" 
					 + "NBA?home_BPM="+home_BPM
					 + "&away_BPM="+away_BPM 
					 + "&home_VORP="+home_VORP 
					 + "&away_VORP="+away_VORP 
					 +"&home_WS="+home_WS
					 + "&away_WS="+away_WS;
// 전송방식(GET-JSON Type)
			URL url = new URL(urlstr);
			HttpsURLConnection urlconnnection = (HttpsURLConnection)url.openConnection();
			urlconnnection.setRequestMethod("GET");
			urlconnnection.setRequestProperty("Content-Type", "application.json; UTF-8");
			urlconnnection.setRequestProperty("Accept", "application/json");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlconnnection.getInputStream(),"UTF-8"));
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			String res = "";

// 얻은 파라미터 저장
			while((responseLine=br.readLine()) != null) {
				response.append(responseLine.trim());
				res = response.toString();
				System.out.println(br.readLine());
			}
// 파라미터 형변환(JSON -> String)후 전송
			String win_Team = res;
			
			if(win_Team.contains("home")) {
				mv.addObject("win_Team", "HOME");
			}
			else if (win_Team.contains("away")) {
				mv.addObject("win_Team", "AWAY");
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return mv;

	}
// KBO게시판으로 이동
	@RequestMapping("/kBoard")
	public String kBoard(Model model) {
		return "kBoard";
	}
// KBO게시판에서 데이터 전송
	@RequestMapping(value="/kBoard_get", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView sendGetkBoard(HttpServletRequest req) {
		System.out.println("RequestMethod.GET방식으로 폼값전송");
		
		ModelAndView mv = new ModelAndView();

		
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

// 파라미터전송(API이용)
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
					+ "&away_hitter9="+aBatter9;
// 전송방식(GET-JSON Type)
			URL url = new URL(urlstr);
			HttpsURLConnection urlconnnection = (HttpsURLConnection)url.openConnection();
			urlconnnection.setRequestMethod("GET");
			urlconnnection.setRequestProperty("Content-Type", "application.json; UTF-8");
			urlconnnection.setRequestProperty("Accept", "application/json");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlconnnection.getInputStream(),"UTF-8"));
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			String res = "";
			
// 얻은 파리미터 저장
			while((responseLine=br.readLine()) != null) {
				response.append(responseLine.trim());
				res = response.toString();
				System.out.println(br.readLine());
			}
// 파라미터 형변환(JSON -> String)후 전송
			String win_Team = res;
			
			if(win_Team.contains("home")) {
				mv.addObject("win_Team","HOME");
			}
			else if(win_Team.contains("away")) {
				mv.addObject("win_Team","AWAY");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return mv;

	}
	
// MLB게시판으로 이동
	@RequestMapping("/mBoard")
	public String mBoard(Model model) {
		return "mBoard";
	}
	
// MLB게시판에서 데이터 전송
	@RequestMapping(value="/mBoard_get", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView sendGetMLB(HttpServletRequest req) {
		System.out.println("RequestMethod.GET방식으로 폼값전송");
		
		ModelAndView mv = new ModelAndView();
		
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
// 파라미터 전송(API 이용)
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
// 전송방식(GET-JSON Type)
			URL url = new URL(urlstr);
			HttpsURLConnection urlconnnection = (HttpsURLConnection)url.openConnection();
			urlconnnection.setRequestMethod("GET");
			urlconnnection.setRequestProperty("Content-Type", "application.json; UTF-8");
			urlconnnection.setRequestProperty("Accept", "application/json");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlconnnection.getInputStream(),"UTF-8"));
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			String res = "";

// 얻은 파라미터 저장
			while((responseLine=br.readLine()) != null) {
				response.append(responseLine.trim());
				res = response.toString();
				System.out.println(br.readLine());
			}
// 파라미터 형변환(JSON -> String)후 
			String win_Team = res;
			
			if(win_Team.contains("home")) {
				mv.addObject("win_Team", "HOME");
			}
			else if (win_Team.contains("away")) {
				mv.addObject("win_Team","AWAY");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return mv;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
