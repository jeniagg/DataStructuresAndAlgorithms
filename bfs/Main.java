package bfs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Number of nodes in the graph:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Source: ");
		int source = scanner.nextInt();
		int matrix[][] = new int[number + 1][number + 1];
		System.out.println("Adjacency matrix:");
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		BFS graph = new BFS();
		System.out.println(graph.bfs(matrix, number, source));
	}

}
