package firstpackage;

public class Queue {
	int size;
	int[] arr;
	int front, rear;

	Queue(int number) {
		size = number;
		arr = new int[size];
		front = -1;
		rear = -1;

	}

	// Add an element to the end of the queue
	void Enqueue(int element) {
		if (isFull()) {
			System.out.println("the Queue is full");
		} else {
			if (front == -1)
				front = 0;
			rear++;
			arr[rear] = element;
			System.out.println("Inserted " + element);
		}

	}

	// Remove an element from the front of the queue
	int deQueue() {
		int element;
		if (IsEmpty()) {
			System.out.println("Queue is empty");
			return (-1);
		} else {
			element = arr[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
			} /* Q has only one element, so we reset the queue after deleting it. */
			else {
				front++;
			}
			System.out.println("Deleted -> " + element);
			return (element);
		}
	}

	// Remove an element from the front of the queue
	boolean IsEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	void display() {

		/* Function to display elements of Queue */
		int i;
		if (IsEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println("\nFront index-> " + front);
			System.out.println("Items -> ");
			for (i = front; i <= rear; i++)
				System.out.print(arr[i] + "  ");

			System.out.println("\nRear index-> " + rear);
		}

	}
	
	boolean isFull() {
	    if (front == 0 && rear == size - 1) {
	      return true;
	    }
	    return false;
	  }
}
