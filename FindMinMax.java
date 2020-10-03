
public class FindMinMax {

	
	void minMax(int[] arr)
	{
		int n=arr.length;
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(max<arr[i])
			{
				max= arr[i];
			}
			else
			{
				if(min>arr[i])
				{
					min=arr[i];
				}
			}
		}
		
		System.out.println("Minimum value = "+min);
		System.out.println("Maximum value = "+max);
	}
}
