package com.learn.java.programs;

public class ReverseAString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given="Agni";
		char[] charcterArray=given.toCharArray();
		String reversed="";
		
		for(int i=charcterArray.length-1;i>=0;i--) {
			reversed=reversed+charcterArray[i];
		}
		System.out.println(reversed);

	}

}
