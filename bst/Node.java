package bst;

public class Node {
	int key;
	String data;
	Node leftChild;
	Node rightChild;
	
	public Node() {
		key = 0;
		data = null;
		leftChild = null;
		rightChild = null;
	}
	
	public Node(int key, String data) {
		this.key = key;
		this.data = data;
	}

}
