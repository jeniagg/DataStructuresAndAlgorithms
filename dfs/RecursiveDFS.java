package dfs;

public class RecursiveDFS {
	static int[] visited = new int[1000];

	public static void dfsRecursive(int source, int[][] matrix, int numberOfNodes) {
		visited[source] = 1;
		System.out.print(source + " ");
		for (int i = 0; i < numberOfNodes; i++) {
			if (matrix[source][i] == 1 && visited[i] == 0) {
				dfsRecursive(i, matrix, numberOfNodes);
			}
		}
	}

}
