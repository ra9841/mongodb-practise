package com.rabin.mongodb.practise.project.vo;

public class TaskVo {
	private int id;
	private String bookName ;
	private int bookPrice;
	private String authorName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "TaskVo [id=" + id + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName=" + authorName
				+ "]";
	}
	
}
