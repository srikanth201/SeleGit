package javaprgs;

import java.util.Scanner;

public class dup {
	
	public static void main(String[] args) {
		
		int a=0,b=1,c;
		
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("Enter any number....");
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}

}
