package CodeCamp1.ArraySum;

import java.util.Arrays;

public class App{
	static int findPairs(int[] arr, int sum) {
		int flag = -1;
		if(arr.length>=2)
		{
			Arrays.sort(arr);
			int low = 0;
			int high = arr.length-1;
			while(low<high)
			{
				if(arr[low]+arr[high]==sum)
				{
					flag = 1;
					
				}
				if(arr[low]+arr[high]<sum)
				{
					low++;
				}
				else { 
					high--;
				}
					
			}
		}
		return flag;
	}
	
}
