package com.java;

public class keywords {
	
	int a=10;
	public void add(){
		int a=20;
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		keywords k=new keywords();
		k.add();
	}

}
