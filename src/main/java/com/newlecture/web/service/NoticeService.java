package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public interface NoticeService {

public int removeNoticeAll(int[] ids);
	public int pubNoticeAll(int[] ids);
	public int insertNotice(Notice notice);
	public int deleteNotice(int id);
	public int updateNoticeAll(Notice notice);
	List<Notice> getNoticeNewestList();
	public List<NoticeView> getNoticeList();
	public List<NoticeView> getNoticeList(int page);
	public List<Notice> getNoticeList(String field/*TUTKE, WRITER_ID*/, String query/*A*/, int page);
	public int getNoticeCount();
	public int getNoticeCount(String field, String query);
	public Notice getNotice(int id);
	public Notice getNextNotice(int id);
	public Notice getPrevNotice(int id);
	public int deleteNoticeAll(int[] ids);
}
