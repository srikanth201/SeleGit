package Arrays;

public class Ascending {
	
	public static void main(String[] args) {
	
	int[] arr=new int[] {1,2,3,10,4,5};
	
	int temp=0;
	
	System.out.println("Original Array.....");
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	System.out.println("Ascending.......");
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	
	
	}
	


}
