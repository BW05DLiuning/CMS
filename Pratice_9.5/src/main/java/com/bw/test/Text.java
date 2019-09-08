package com.bw.test;

import java.util.Scanner;

import com.bw.utils.StringUtils;

public class Text {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); while(true) { System.out.println("输入");
		 * String next = sc.next(); StringUtils utils = new StringUtils(); boolean b =
		 * utils.inletter(next); System.out.println(b); }
		 */
		StringUtils utils = new StringUtils();
		/*
		 * String str = utils.rendomStr(5); System.out.println(str);
		 */
		String radom = utils.radom(3); 
		System.out.println(radom);
	}
	
}
