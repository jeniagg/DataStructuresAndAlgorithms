package bst;

public class Main {

	public static void main(String[] args) {
		BST myTree = new BST();
		
		myTree.add(40, "key is 40");
		myTree.add(25, "key is 25");
		myTree.add(78, "key is 78");
		myTree.add(10, "key is 10");
		myTree.add(3, "key is 3");
		myTree.add(17, "key is 17");
		myTree.add(32, "key is 32");
		myTree.add(30, "key is 30");
		myTree.add(38, "key is 38");
		myTree.add(78, "key is 78");
		myTree.add(50, "key is 50");
		myTree.add(93, "key is 93");
		
//		myTree.inOrderTraverse(myTree.root);
//		System.out.println(myTree.findNode(5));
//		myTree.preOrderTraverse(myTree.root);
//		myTree.postOrderTraverse(myTree.root);
		System.out.println(myTree.remove(41));
		System.out.println(myTree.remove(17));
		myTree.preOrderTraverse(myTree.root);
		
	}
}
