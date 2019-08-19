package Aug19;

import java.util.Scanner;

public class pallstrin {
	
	public static void main(String[] args) {
		
		String original,rev=" ";
		Scanner s=new Scanner(System.in);
		original=s.nextLine();
		int len = original.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		
		//System.out.println(rev);
		
		if(original.equals(rev))
		{}
	}

}
