package com.girmiti.java;

public class traditionalwaypro2 {

	public static void main(String[] args) {
		String n="malayalam";
		String m="";
		for(int i=n.length()-1;i>=0;i--) {
			m=m+n.charAt(i);
		}
		System.out.println(m);
		if(n.equals(m)) {
			System.out.println(true);
		}
		else
			System.out.println(false);

	}

}
