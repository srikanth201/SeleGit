package javaprgs;

public class DuplicatesinArray {
	
	public static void main(String[] args) {
		
		int a[]=new int[] {1,2,3,4,5,6,6,9,9,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}
