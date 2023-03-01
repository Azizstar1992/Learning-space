package interview2;

public class main {

	public static void main(String[] args) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);

		System.out.println("Following is Depth First Traversal");

		g.DFS(0);
		System.out.println("----");
		int[] arr = { 5, 2, 9, 1, 5, 6 };
		MergeSort.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
