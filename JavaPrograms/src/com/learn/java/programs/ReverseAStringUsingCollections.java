package com.learn.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAStringUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="Agni";
		
		char[] array=given.toCharArray();
		
		List<Character> list=new ArrayList<Character>();
		
		for (Character character : array) {
			list.add(character);
		}
		
		Collections.reverse(list);
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
