package javaprgs;

public class sumofelementsArray {
	
	public static void main(String[] args) {
		
		int a[]=new int[] {21,22,34,566,8};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		
	}

}
