package dfs;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {

	private Stack<Integer> st;

	public DFS() {
		this.st = new Stack<Integer>();
	}

	public String dfs(int[][] matrix, int numberOfNodes, int source) {
		LinkedList<Integer> res = new LinkedList<Integer>();
		int[] visited = new int[numberOfNodes];
		for (int i = 0; i < numberOfNodes; i++) {
			visited[i] = 0;
		}

		st.push(source);
		visited[source] = 1;
		res.add(source);

		int element;
		while (!st.isEmpty()) {
			element = st.peek();
			for (int i = 0; i < numberOfNodes; i++) {
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
