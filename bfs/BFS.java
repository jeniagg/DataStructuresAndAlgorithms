package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	private Queue<Integer> queue;

	public BFS() {
		this.queue = new LinkedList<Integer>();
	}

	public String bfs(int[][] matrix, int numberOfNodes, int source) {

		int[] visited = new int[numberOfNodes];
		for (int j = 0; j < numberOfNodes; j++) {
			visited[j] = 0;
		}
		LinkedList<Integer> res = new LinkedList<Integer>();
		int i, element;
		visited[source] = 1;
		queue.add(source);
		res.add(source);
		while (!queue.isEmpty()) {
			element = queue.remove();
			i = 0;
			while (i < numberOfNodes) {
				if (matrix[element][i] == 1 && visited[i] == 0) {
					queue.add(i);
					visited[i] = 1;
					res.add(i);
				}
				i++;
			}
		}
		return res.toString();
	}
}
