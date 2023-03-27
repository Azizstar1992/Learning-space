package firstpackage;

import java.util.Arrays;

public class Main {
	public static int factorial(int x) {
		if(x == 1)return x;
		return x * factorial(x-1);
	}
	
	static int sum(int N) {
	    return N * (N + 1) / 2;
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Stack a = new Stack(5);
		a.push(10);
		a.push(9);
		a.push(11);
		a.push(11);
		a.push(11);
		a.push(14);
		a.push(16);
		a.Peek();;;
		
		//binary Search
		int[] arr = {1,2,4,5,6,9,11,44,55,66,77};
		BinarySearch b = new BinarySearch();
		b.search(arr, 77);
		
		
		//linked list
		LinkedList linked = new LinkedList();
		linked.addNode(10);
		linked.addNode(5);
		
		System.out.print(sum(10)-sum(9));
		
		
		
		//Queue
		Queue q = new Queue(5);

	    // deQueue is not possible on empty queue
	    q.deQueue();

	    // enQueue 5 elements
	    q.Enqueue(1);
	    q.Enqueue(2);
	    q.Enqueue(3);
	    q.Enqueue(4);
	    q.Enqueue(5);

	    // 6th element can't be added to because the queue is full
	    q.Enqueue(6);

	    q.display();

	    // deQueue removes element entered first i.e. 1
	    q.deQueue();

	    // Now we have just 4 elements
	    q.display();
		System.out.println("-----");
	    //insertion sort 
	    int[] data = { 10, 5, 1, 4, 3 };
		InsertionSort is = new InsertionSort();
		is.insertionSort(data);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
		System.out.println("------------");
		//merge sort
		int arr1[] = { 6, 5, 12, 10, 9, 1 };

	   
	    MergeSort.mergesort(arr1);

	    System.out.println("merge sorted array:");
	    printArray(arr1);
		
	    String s = "hello world my name is aziz";
	    Arrays.stream(s.split(" ")).forEachOrdered(n ->System.out.println(n));

	}

}
