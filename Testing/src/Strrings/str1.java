package Strrings;

public class str1 {
	
	public static void main(String[] args) {
		
		String str = "This is srikanth";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!= ' ')
				count++;
		}
		System.out.println(count);
	}

}
