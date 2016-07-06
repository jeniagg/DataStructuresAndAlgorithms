package bst;

public class BST {
	Node root;
	
	public void add(int key, String data) {
		Node newNode = new Node(key, data);
		if (root == null) {
			root = newNode;
		} else {
			Node currentNode = root;
			Node parrentNode;
			while (true) {
				parrentNode = currentNode;
				if (newNode.key < currentNode.key) {
					currentNode = currentNode.leftChild;
					if (currentNode == null) {
						parrentNode.leftChild = newNode;
						return;
					} 
				} else {
					currentNode = currentNode.rightChild;
					if (currentNode == null) {
						parrentNode.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraverse(Node currentNode) {
		if (currentNode != null) {
			inOrderTraverse(currentNode.leftChild);
			System.out.println(currentNode.data);
			inOrderTraverse(currentNode.rightChild);
		}
	}
	
	public void preOrderTraverse(Node currentNode) {
		if (currentNode != null) {
			System.out.println(currentNode.data);
			preOrderTraverse(currentNode.leftChild);
			preOrderTraverse(currentNode.rightChild);
		}
	}
	
	public void postOrderTraverse(Node currentNode) {
		if (currentNode != null) {
			postOrderTraverse(currentNode.leftChild);
			postOrderTraverse(currentNode.rightChild);
			System.out.println(currentNode.data);
		}
	}
	
	public String findNode(int key) {
		Node currentNode = root;
		while (key != currentNode.key) {
			if (key < currentNode.key) {
				currentNode = currentNode.leftChild;
			} else {
				currentNode = currentNode.rightChild;
			}
			if (currentNode == null) {
				return null;
			}
		} 
		return currentNode.data;
	}
	
	public boolean remove(int key) {
		Node currentNode = root;
		Node parentNode = root;
		
		boolean isLeftChild = true;
		while (currentNode.key != key) {
			parentNode = currentNode;
			if (key < currentNode.key) {
				isLeftChild = true;
				currentNode = currentNode.leftChild;
			} else {
				isLeftChild = false;
				currentNode = currentNode.rightChild;	
			}
			if (currentNode == null) {
				return false;
			}
		}
		if (currentNode.leftChild == null && currentNode.rightChild == null) {
			if (currentNode == root) {
				root = null;
			} else if (isLeftChild) {
				parentNode.leftChild = null;
			} else {
				parentNode.rightChild = null;
			}
		}			
		else if (currentNode.rightChild == null) {
			if (currentNode == root) {
				root = currentNode.leftChild;
			} else if (isLeftChild) {
				parentNode.leftChild = currentNode.leftChild;
			} else {
				parentNode.rightChild = currentNode.leftChild;
				}
		}
		else if (currentNode.leftChild == null) {
			if (currentNode == root) {
				root = currentNode.rightChild;
			} else if (isLeftChild) {
				parentNode.leftChild = currentNode.rightChild;
			} else {
				parentNode.rightChild = currentNode.rightChild;
			}
		}
		else {
			Node replacement = getReplacementNode(currentNode);
			if (currentNode == root) {	
				root = replacement;
			} else if (isLeftChild) {
				parentNode.leftChild = replacement;
			} else {
				parentNode.rightChild = replacement;
			}
			replacement.leftChild = currentNode.leftChild;
		}
		return true;
	}
	
	public Node getReplacementNode(Node replaceNode) {
		Node replacement = replaceNode;
		Node parentReplacement = replaceNode;
		Node currentNode = replaceNode.rightChild;
		while (currentNode != null) {
			parentReplacement = replacement;
			replacement = currentNode;
			currentNode = currentNode.leftChild;
		}
		if (replacement != replaceNode.rightChild) {
			parentReplacement.leftChild = replacement.rightChild;
			replacement.rightChild = replaceNode.rightChild;
		}
		return replacement;
	}

}
