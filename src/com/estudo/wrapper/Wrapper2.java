package com.estudo.wrapper;

public class Wrapper2 {
	
	public static void main(String[] args) {
		
		//Wrapper Class
		//Boxing
		Integer i = 10;
		
		//Unboxing
		Integer i1 = new Integer(10);
		int y = i1;
		
		Integer iA = 127;
		Integer iB = 127;
		Integer iC = 128;
		Integer iD = 128;
		
		System.out.println(iA.equals(iB));
		System.out.println(iC.equals(iD));
		
	}

}
