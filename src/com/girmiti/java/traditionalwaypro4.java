package com.girmiti.java;

import java.util.Scanner;

public class traditionalwaypro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fi=0;
		int si=0;
		int op=0;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the 1st value ");
		fi=ip.nextInt();
		System.out.println("Enter the 2st value ");
		si=ip.nextInt();
		System.out.println("Enter the op 1.Add 2.Sub 3.Div 4.Mul 5.Mod");
		op=ip.nextInt();
		switch(op) {
		case 1:
			System.out.println(fi+si);
			break;
		case 2:
			System.out.println(fi-si);
			break;
		case 3:
			System.out.println(fi/si);
			break;
		case 4:
			System.out.println(fi*si);
			break;
		case 5:
			System.out.println(fi%si);
			break;
			default: System.out.println("Enter valid OP");
		
		}
		

	}

}
