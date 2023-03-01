package firstpackage;

public class Stack {
	private int arr[];
	private int top;
	private int capacity;

	// Creating a stack
	Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// Add elements into stack
	public void push(int x) {
		if (isFull()) {
			System.out.println("Error Stack is Full");
			
		}
		else {
		System.out.println("Inserting " + x);
		arr[++top] = x;
		}
	}

	// Remove element from stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("STACK EMPTY");
			System.exit(1);
		}
		return arr[top--];
	}

	// Utility function to return the size of the stack
	public int size() {
		return top + 1;
	}

	// Check if the stack is empty
	public Boolean isEmpty() {
		return top == -1;
	}

	// Check if the stack is full
	public Boolean isFull() {
		return top == capacity - 1;
	}

	public void Peek() {

		System.out.println("Stack load is " +(top+1) + " out of " +capacity);

	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}
}