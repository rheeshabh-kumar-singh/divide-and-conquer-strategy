
public class BinarySearch {

	int[] array;
	int key;
	boolean found=false;
	void binarySearch(int[] a,int k)
	{
		key=k;
		array=a;
		int low= 0;
		int high= a.length-1;
		startSearch(low, high);
	}
	
	void startSearch(int low,int high)
	{
		
		while(low<high && !found)
		{
			int mid=(low+high)/2;
			if(array[mid] == key)
			{
				found=true;
				System.out.println("element "+key+" found at index: "+mid);
			}
			else if(key<array[mid])
			{
				startSearch(low,mid-1);
			}
			else if(key>array[mid])
			{
				startSearch(mid+1,high);
			}
		}
		if(!found)
		{
			System.out.println("element "+key+" not found");
		}
	}
}
