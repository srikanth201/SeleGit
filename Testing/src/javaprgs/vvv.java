package javaprgs;

public class vvv {
	
	public static void main(String[] args) {
		
		String str = "Srikanth";
		
		int vowels=0,consonants=0;
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowels++;
			}
			else if (str.charAt(i)>='a' && str.charAt(i)<='z' )
			{
				consonants++;
			}
		}
		
		System.out.println(vowels);
		System.out.println(consonants);
		
	
	}

}
