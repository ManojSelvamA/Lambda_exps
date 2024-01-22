package com.girmiti.java;

import java.util.Scanner;

interface calculator{
	void cal(int a,int b);
}
public class pro4 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		calculator c=(int x,int y)->{
			System.out.println("Enter the op 1.Add 2.Sub 3.Div 4.Mul 5.Mod");
			int op;
			op=ip.nextInt();
			
			switch(op) {
			case 1:
				System.out.println(x+y);
				break;
			case 2:
				System.out.println(x-y);
				break;
			case 3:
				System.out.println(x/y);
				break;
			case 4:
				System.out.println(x*y);
				break;
			case 5:
				System.out.println(x%y);
				break;
				default: System.out.println("Enter valid OP");
			
			}
			
		};
		c.cal(ip.nextInt(), ip.nextInt());
		

	}

}
