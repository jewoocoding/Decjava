package com.dec.day09.myexercise.academy;

import java.util.Scanner;



public class Exercise2 {
	
	public static void main(String[] args) {
		
		String str1 = new String("string");
		String str2 = new String("string");
		
		String str3 = "String";
			
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
//		int num;
//		System.out.println(num);
		
	}

}
