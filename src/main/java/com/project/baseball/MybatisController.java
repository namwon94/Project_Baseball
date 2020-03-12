package com.project.baseball;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mybatis.MemberVO;
import mybatis.MybatisMember;

@Controller
public class MybatisController {

	
	private SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		System.out.println("@Autowired->DB 연결성공");
	}
	
	//로그인 페이지
	@RequestMapping("/mybatis/login.do")
	public String login(Model model) {
		return "login";
	}
	
	//로그인 처리
	@RequestMapping("/mybatis/loginAction.do")
	public ModelAndView loginAction(HttpServletRequest req, HttpSession session) {
		MemberVO vo = sqlSession.getMapper(MybatisMember.class).login(req.getParameter("id"), req.getParameter("pass"));
		
		ModelAndView mv = new ModelAndView();
		
		if(vo==null) {
			//로그인 실패 할때
			mv.addObject("LoginNG","아이디/패스워드가 틀렸습니다.");
			//로그인 페이지로
			mv.setViewName("login");
			
			return mv;
		}
		else {
			//성공했을때
			session.setAttribute("siteUserInfo", vo);
		}
		
		//로그인 후 페이지 이동
		String backUrl = req.getParameter("backUrl");
		if(backUrl==null || backUrl.equals("")) {
			mv.setViewName("login");
		}
		else {
			mv.setViewName(backUrl);
		}
		
		return mv;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
