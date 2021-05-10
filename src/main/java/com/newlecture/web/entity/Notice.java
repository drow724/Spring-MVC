package com.newlecture.web.entity;

import java.util.Date;

public class Notice {
	private int id;
	private String title;
	private Date regDate;
	private String content;
	private String files;
	private String writerId;
	private String hit;
	private boolean pub;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Notice(int id, String title, Date regDate, String content, String files, String writerId, String hit,
			boolean pub) {

		this.id = id;
		this.title = title;
		this.regDate = regDate;
		this.content = content;
		this.files = files;
		this.writerId = writerId;
		this.hit = hit;
		this.pub = pub;
	}



	public int getid() {
		return id;
	}

	public void setid(int id) {
		id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getHit() {
		return hit;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public boolean getPub() {
		return pub;
	}



	public void setPub(boolean pub) {
		this.pub = pub;
	}



	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", regDate=" + regDate + ", content=" + content + ", files="
				+ files + ", writerId=" + writerId + ", hit=" + hit + ", pub=" + pub + "]";
	}



	
}
