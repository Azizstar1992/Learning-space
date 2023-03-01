package firstpackage;

public class BinarySearch 
{
	BinarySearch() {
	}
	
	public void  search(int[] arr, int target) 
	{
	
		int low = 0;
		int high = arr.length-1;
		int mid = low + (high-low)/2;
		while(low <= high) 
		{
			mid = low + (high-low)/2;
			if(arr[mid] == target) 
			{
				break;
			}
			else if( arr[mid] > target)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		if(arr[mid] == target) 
		{
		System.out.println("Target: "+target+" Found at : " + mid);
		}
		else 
		{
			System.out.println("Target not found");	
		}
	}

}