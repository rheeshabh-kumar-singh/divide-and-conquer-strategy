
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
	
	
//	void DandCminMax(int[] a,int low, int high,int min, int max)
//	{
//		if(low==high)
//		{
//			min=max=a[low];
//		}
//		else if(low==high-1)
//		{
//			if(a[low]<=a[high])
//			{
//				min=a[low];
//				max=a[high];
//			}
//			else
//			{
//				min=a[high];
//				max=a[low];
//			}	
//		}
//		else
//		{
//			if(low<high)
//			{
//				
//				int mid= (low+high)/2;
//				DandCminMax(a, low,mid,min,max);
//				int min1 = 0,max1 = 0;
//				DandCminMax(a,mid+1,high,min1,max1);
//				if(min>min1)
//				{
//					min=min1;
//				}
//				if(max<max1)
//				{
//					max=max1;
//				}
//				
//			}
//		}
//		
//		System.out.println("Minimum value = "+min);
//		System.out.println("Maximum value = "+max);
//	}
	
	
	
	
	
	
	
	
	
}
