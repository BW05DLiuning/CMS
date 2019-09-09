package com.bw.stringutils;

public class StringUtils {
	public static String toHtmlse(String str) {
		String[] split = str.split("\\\r");
		StringBuilder sb = new StringBuilder();
		for (String string : split) {
			sb.append("<p>").append(string).append("</p>\\n");
		}
		return sb.toString();
		
	}
}
