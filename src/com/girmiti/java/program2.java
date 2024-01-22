package com.girmiti.java;


interface palindrome{
	void checkpalindrome(String n);
}
public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome pp=(x)->{
			String m="";
			
			for(int i=x.length()-1;i>=0;i--) {
				m=m+x.charAt(i);
			}
			System.out.println(m);
			if(x.equals(m)) {
				System.out.println(true);
			}
			else
				System.out.println(false);
			
		};
		pp.checkpalindrome("girmiti");

	}

}
