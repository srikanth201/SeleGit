package Aug19;

public class swap {

	public static void main(String[] args) {
		
		int a=10,b=20;
		
		System.out.println("Before swap....");
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap....");
		System.out.println(a);
		System.out.println(b);
	}
}
