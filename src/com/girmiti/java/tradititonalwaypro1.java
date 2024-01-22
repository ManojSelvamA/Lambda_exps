package com.girmiti.java;

public class tradititonalwaypro1 {
	public static void main(String args[]) {
		int n[]= {2,3,4,5};
		int e=0;
		int o=0;
for(int k:n) {
	if(k%2==0)
		
		e=(int) (e+Math.pow(k, 2));
	
	else if(k%2!=0)
		
		o=(int) (o+Math.pow(k, 2));
}
System.out.println("Even Square "+e);
System.out.println("Odd Square "+o);
System.out.println("sum of Sq "+(e+o));
}
	
}

