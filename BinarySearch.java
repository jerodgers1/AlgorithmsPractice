import java.util.ArrayList;


public class BinarySearch {
	
	public int Search(ArrayList<Integer> list, int left, int right, int key)
	{
		if(left < right)
		{
			int middle = left + (right - left)/2;
			if(list.get(middle) == key)
			{
				return list.get(middle);
			}
			
			if(list.get(middle) > key)
			{
				return Search(list, left, middle-1, key);
			}
			return Search(list, middle+1, right, key);
		}
		return -1;
	}
}
