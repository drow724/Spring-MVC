package com.newlecture.web.controller.admin.board;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@Autowired
	private ServletContext ctx;
	
	@RequestMapping("list")
	public String list() {
		return "";
	}
	
	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title, String content, MultipartFile[] files, String category, String[] foods, String food, HttpServletRequest request) throws IllegalStateException, IOException {
		
		for(MultipartFile file : files) {
			long size = file.getSize();
			String fileName = file.getOriginalFilename();
			System.out.printf("fileName:%s, fileSize:%d\n", fileName, size);
			
			//ServletContext ctx = request.getServletContext();
			String webPath = "/static/upload";
			String realPath = ctx.getRealPath(webPath);
			System.out.printf("realPath : %s\n", realPath);
			// 업로드 하기 위한 경로가 없을 경우
			File savePath = new File(realPath);
			if(!savePath.exists())
				savePath.mkdirs();
			
			realPath += File.separator + fileName;
			File savaFile = new File(realPath);
			
			file.transferTo(savaFile);
		}
		for(String f : foods)
			System.out.println(f);
		System.out.println(food);
		return String.format("title:%s<br>content:%s<br>category:%s<br>", title, content, category);
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "";
	}
	
	@RequestMapping("delete")
	public String delete() {
		return "";
	}
}
