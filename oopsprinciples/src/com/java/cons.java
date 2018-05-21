package com.java;

public class cons {
	public cons(){
		this(5);
		System.out.println("d-c");
	}
   public cons(int a){
	   this(5,6);
	   System.out.println("1-p-c");
   }
   public cons(int a,int b){
	   this(4,5,6);
	   System.out.println("2-p-c");
   }
	public cons(int a,int b,int c){
		System.out.println("3-p-c");
	}
	
	public static void main(String[] args) {
		
		
		cons c=new cons();
		
		
	}
}
