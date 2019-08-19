package cmmn;

import java.util.Scanner;

public class pallwithstring {
	
	public static void main(String[] args) {
		
		String Original,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur string......");
		Original = s.nextLine();
		int len = Original.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+Original.charAt(i);
		}
		
		System.out.println(rev);
	}

}
