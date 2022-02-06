public class genericsQ3 
{
	public static <T> void swapping(T[] arr, int i, int j)
	{
		T temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args) 
	{
		Integer arr[]= {2,4,6,8,10,12};
		System.out.println("Before swapping:");
		for (Integer k : arr) 
		{
			System.out.print(k+" ");
		}
		System.out.println("\n After swapping ");
		swapping(arr,3,4);
		for (Integer l:arr) 
		{
			System.out.print(l+" ");
		}
	}
}
