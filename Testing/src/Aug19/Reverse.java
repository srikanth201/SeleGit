package Aug19;

public class Reverse {
	public static void main(String[] args) {
		int num=153,rev=0,rem,original;
		original=num;
		
		while(num>0)
		{
			rem=num%10;
			num/=10;
			rev=rev+(rem*rem*rem);
		}
		//System.out.println(rev);
		
		if(original==rev)
		System.out.println("Amstr");
		else
			System.out.println("Not a Amstr...");
	}

}
