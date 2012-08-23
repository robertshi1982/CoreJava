package com.mercury.rb_string;

import java.util.Scanner;

/**
 * @Title: ParenthesesMatch.java
 * @Description: Check if a string of [],(),{} are in matched order.
 * @author Robert Shi
 * @date Aug 23, 2012 2:40:20 PM
 * @version V1.0
 */
public class ParenthesesMatch {

	/**
	 * @param a
	 * @param b
	 * @return match two symbols
	 */
	public static boolean match(char a,char b) {
		if(a=='{'){
			if(b=='}')return true;
		}
		if(a=='('){
			if(b==')')return true;
		}
		if(a=='['){
			if(b==']')return true;
		}
		return false;
	}
	
	/**
	 * @param s
	 * @return if expression is matched
	 */
	public static boolean parMatch(String s) {
		char[] a = s.toCharArray();
		for(int i=0;i<a.length/2;i++){
			if(!match(a[i],a[a.length-1-i])){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		if (parMatch(in)) {
			System.out.println("Match");
		}else {
			System.out.println("Not match");
		}
		
	}

}
