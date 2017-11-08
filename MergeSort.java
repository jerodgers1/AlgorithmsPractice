import java.util.ArrayList;


public class MergeSort {
	
	public static void mergeSort(ArrayList<Integer> arr, int left, int right)
	{
		if(left < right)
		{
			int middle = (left+right)/2;
			
			mergeSort(arr, left, middle);
			mergeSort(arr, middle+1, right);
			
			Merge(arr, left, middle, right);
		}
	}
	
	private static void Merge(ArrayList<Integer> list, int left, int middle, int right)
	{
		int leftLength = middle - left + 1;
		int rightLength = right - middle;
		
		ArrayList<Integer> leftList = new ArrayList<Integer>(leftLength);
		ArrayList<Integer> rightList = new ArrayList<Integer>(rightLength);
		for(int i=0; i < leftLength; i++)
		{
			leftList.add(list.get(left + i));
		}		
		for(int i=0; i < rightLength; i++)
		{
			rightList.add(list.get(middle + i + 1));
		}
		
		int i=0, j=0, k=left;
		
		//here would be a good place for a if else statement based on the 
		//type of the list
		while(i<leftLength && j < rightLength )
		{
			if(leftList.get(i) < rightList.get(j))
			{
				list.set(k++, leftList.get(i++));
			}
			else
			{
				list.set(k++, rightList.get(j++));
			}
		}
		while(i < leftLength)
		{
			list.set(k++, leftList.get(i++));
		}
		while(j < rightLength)
		{
			list.set(k++, rightList.get(j++));
		}
	}
}

