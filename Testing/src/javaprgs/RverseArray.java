package javaprgs;

public class RverseArray {
	
	public static void main(String[] args) {
		
		int a[]=new int[]{1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
