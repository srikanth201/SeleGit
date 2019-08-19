package Arrays;

public class copy {
	
public static void main(String[] args) {
		
		int[] arr=new int[] {1,2,3,4,5};
		
		int[] arr1=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		
		System.out.println("Original array");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
System.out.println("Copied array");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
}

}
