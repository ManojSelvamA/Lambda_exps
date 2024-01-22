package com.girmiti.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
interface squares{
	void Sq(List<Integer> x);
	
}
public class program1 {

	public static void main(String[] args) {
		
		
		List<Integer> demo = Arrays.asList(2,3,4,5);
		
		System.out.println("List"+demo);
		squares s1=(d)->{
			int e=0;
			int o=0;
			for(int k:d) {
				//r=(int) (r+Math.pow(k, 2));
				if(k%2==0)
					
					e=(int) (e+Math.pow(k, 2));
				
				else if(k%2!=0)
					
					o=(int) (o+Math.pow(k, 2));
			}
			System.out.println("Even Square "+e);
			System.out.println("Odd Square "+o);
			System.out.println("sum of Sq "+(e+o));
			
		};
		
		s1.Sq(demo);

	}

}
