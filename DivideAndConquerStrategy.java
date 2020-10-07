
public class DivideAndConquerStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {2,4,-1,6,-9,-65,34,99,23,100};
		FindMinMax fmm= new FindMinMax();
		fmm.minMax(arr);
		
		MergeSort ms= new MergeSort();
		ms.mergeSort(arr, 0, 9);
		
		
		QuickSort quicksort=new QuickSort();
		quicksort.quickSort(arr, 0, arr.length-1);
	}

}
