package com.yunmi.security.vo;


public class Customer {
	
	private String id;
	private String pwd;
	private String grant;
	
	public Customer(String id, String pwd, String grant) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.grant = grant;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGrant() {
		return grant;
	}
	public void setGrant(String grant) {
		this.grant = grant;
	}
	
}
