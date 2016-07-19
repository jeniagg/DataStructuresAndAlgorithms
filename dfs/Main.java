package dfs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Number of nodes: ");
		Scanner scanner = new Scanner(System.in);
		int numberOFNodes = scanner.nextInt();
		System.out.println("Source:");
		int source = scanner.nextInt();
		System.out.println("Adjacency matrix:");
		int[][] matrix = new int[numberOFNodes + 1][numberOFNodes + 1];
		for (int i = 1; i <= numberOFNodes; i++) {
			for (int j = 1; j <= numberOFNodes; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		RecursiveDFS.dfsRecursive(source, matrix, numberOFNodes);
		System.out.println();
		System.out.println(DFS.dfs(matrix, numberOFNodes, source));

	}
}
