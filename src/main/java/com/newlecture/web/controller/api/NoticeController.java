package com.newlecture.web.controller.api;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;
import com.newlecture.web.service.jdbc.JDBCNoticeService;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired
	private JDBCNoticeService noticeService;
	
	@RequestMapping("list")
	public Notice list() {
		
		List<NoticeView> list = noticeService.getNoticeList("title", "", 1);
		
		return list.get(0);
	}
}
