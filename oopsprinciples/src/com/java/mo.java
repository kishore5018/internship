package com.java;

public class mo extends mo1 {
	
	public void add(int a){
		super.add(6);
		System.out.println(a+"child");
	}
	
	public static void main(String[] args) {
		mo m=new mo();
		m.add(5);
		
	}
	
	

}
