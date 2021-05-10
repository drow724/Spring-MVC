package com.newlecture.web.controller.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {

	@RequestMapping("/detail")
	public void detail() {
		// TODO Auto-generated method stub
	}
	
	@RequestMapping("/list")
	public void list() {
		// TODO Auto-generated method stub
	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC!");
//		//mv.setViewName("/WEB-INF/view/index");
//		return mv;
//	}
	
}
