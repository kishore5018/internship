package com.java;

public class encpsulation {

	private String username;
	private String password;
	private int id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		
		encpsulation e=new encpsulation();
		e.setUsername("cubic");
		e.setPassword("cubic123");
		e.setId(123456);
		System.out.println(e.getUsername());
		System.out.println(e.getPassword());
		System.out.println(e.getId());
		encpa.printdata(e);
		
		
	}
	
	

}
