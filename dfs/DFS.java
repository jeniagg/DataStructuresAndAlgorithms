package dfs;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {

	private static Stack<Integer> st = new Stack<Integer>();

	static int[] visited = new int[1000];

	public static String dfs(int[][] matrix, int numberOfNodes, int source) {
		LinkedList<Integer> res = new LinkedList<Integer>();
		st.push(source);
		visited[source] = 1;
		res.add(source);
		int element;

		while (!st.isEmpty()) {
			element = st.peek();
			for (int i = 0; i < numberOfNodes + 1; i++) {
				if (matrix[element][i] == 1 && visited[i] == 0) {
					visited[i] = 1;
					st.push(i);
					res.add(i);
					element = i;
					i = 0;
				}
			}
			st.pop();
		}
		return res.toString();
	}

}
