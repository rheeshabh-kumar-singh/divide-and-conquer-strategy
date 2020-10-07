
public class QuickSort {

	

	
	int array[];
	
	void quickSort(int[] a,int p,int r)
	{
		array=a;
		if(p<r)
		{
			int q=partition(p,r);
			quickSort(array,p,q-1);
			quickSort(array,q+1,r);
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print("{"+array[i]+"}");
			
		}
		System.out.println();
	}
	
	
	int partition(int p,int r)
	{
		int x=array[r];
		int i= p-1;
		for(int j=p;j<r;j++)
		{
			if(array[j]<=x)
			{
				i=i+1;
				swap(i,j);
			}
		}
		swap(i+1,r);
		return i+1;
		
	}
	
	
	
	
	
	
	void swap(int i, int j) 
	{
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}
