
public class MergeSort {
	
	static int[] A;
	static void mergeSort(int[] arr,int p,int r)
	{
		A= arr;
		if(p<r)
		{
			int q= (p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);
		}
	}
	
	static void merge(int[] A,int p, int q, int r)
	{
		int n1= q-p+1;
		int n2= r-q;
		int[] L= new int[n1];
		int[] R= new int[n2];
		
		for(int i=0;i<n1; i++)
		{
			L[i]=A[p+i];
		}
		for(int j=0;j<n2;j++)
		{
			R[j]=A[q+1+j];
		}
		
		
	}

}
