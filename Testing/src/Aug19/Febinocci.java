package Aug19;

public class Febinocci {
	
	public static void main(String[] args) {
		
		int a=0,b=1,c;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<10;i++)
			
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
	}

}
