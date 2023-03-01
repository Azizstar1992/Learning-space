package firstpackage;

public class MergeSort {
	static void mergesort(int[] inputArray) 
	{
		int inputLength = inputArray.length;
		if(inputLength<2) {
			return;
		}
		int midindex = inputLength/2;
		int[] leftHalf = new int[midindex];
		int[] rightHalf = new int[inputLength-midindex];
		
		for(int i = 0; i < midindex;i++) 
		{
			leftHalf[i] = inputArray[i];
		}
		
		for(int i = midindex ; i < midindex;i++) 
		{
			rightHalf[i-midindex] = inputArray[i];
		}
		
		mergesort(leftHalf);
		mergesort(rightHalf);
		merge(inputArray, leftHalf,rightHalf); 
	}
	static void merge(int[] inputArray,int[] leftHalf,int[] rightHalf) {
		int leftSize = leftHalf.length,rightSize = rightHalf.length;
		int i =0, j = 0,k=0;
		
		while(i< leftSize && j <rightSize) 
		{
			if(leftHalf[i]<= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			}
			else 
			{
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		while(i<leftSize) 
		{
			inputArray[k]= leftHalf[i];
			i++;
			k++;
		}
		while(j<rightSize) 
		{
			inputArray[k]= rightHalf[j];
			j++;
			k++;
		}
	}

	// Print the array
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
