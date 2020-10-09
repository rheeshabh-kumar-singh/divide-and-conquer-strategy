
public class DivideAndConquerStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {2,4,-1,6,-9,-65,34,99,23,100};
		FindMinMax fmm= new FindMinMax();
		fmm.minMax(arr);
		
		
//		fmm.DandCminMax(arr, 0, 9, 0,0);
		
		
		MergeSort ms= new MergeSort();
		ms.mergeSort(arr, 0, 9);

		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		
		BinarySearch bs= new BinarySearch();
		int key=-1;
		bs.binarySearch(arr, key);
		
		
//		
//		QuickSort quicksort=new QuickSort();
//		quicksort.quickSort(arr, 0, arr.length-1);
	}

}
