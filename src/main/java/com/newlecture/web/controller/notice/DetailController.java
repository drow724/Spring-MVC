package com.newlecture.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DetailController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mv = new ModelAndView("notice.detail");
		//mv.setViewName("/WEB-INF/view/index");
		return mv;
	}
	
}
