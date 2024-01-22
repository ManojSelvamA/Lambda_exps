package com.girmiti.java;


interface string{
	void constring(String x,String k);
}
public class concatenatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string d=(String a, String s)->{
			String n=a.concat(s);
			System.out.println(n);
			
		};
		d.constring("Once a King ", " is Always a King ");

	}

}
