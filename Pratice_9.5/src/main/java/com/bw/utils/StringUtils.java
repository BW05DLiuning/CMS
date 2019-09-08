package com.bw.utils;

import java.util.Random;

public class StringUtils {
	
	
	public static boolean inletter(String str) {
		String patter="^(17|13|15)\\d{8}$";
		return str.matches(patter);
	}
	public String rendomStr(int n) {
		if(n<0) 
			return "";
		Random random = new Random();
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i <n; i++) {
			char letter=(char)('A'+random.nextInt(26));
			sb.append(letter); 
		}
		return sb.toString();
	}
	public String radom(int n) {
		char arr[]= {'5','2','1'};
		
		
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <n; i++) {
			int nextInt = random.nextInt(arr.length);
			char c=arr[nextInt];
			builder.append(c);
		}
		return builder.toString();
	}
}
