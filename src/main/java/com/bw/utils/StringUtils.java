package com.bw.utils;

public class StringUtils {
	public static String toHtmls(String str) {
		String[] split = str.split("\\\r");
		StringBuffer sb = new StringBuffer();
		for (String string : split) {
			sb.append("<p>").append(split).append("</p>");
		}
		return sb.toString(); 
		
	}
}
