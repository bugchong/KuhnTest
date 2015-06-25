package com.example.kuhntest;

public class Dbinfo {
	private int id;
	private int stockcode;
	private String stockname;
	private String title;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStockcode() {
		return stockcode;
	}
	public void setStockcode(int stockcode) {
		this.stockcode = stockcode;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Dbinfo(int id,int stockcode,String stockname,String title){
		this.id = id;
		this.stockcode = stockcode;
		this.stockname = stockname;
		this.title = title;
	}

}