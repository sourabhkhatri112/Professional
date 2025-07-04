import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	String data;
	TreeNode leftChild;
	TreeNode rightChild;


	public TreeNode(String data) {
		this.data = data;
		this.leftChild = this.rightChild = null;
	}
}

public class SimpleTree {
	public static void SimpleTreeInsertion(TreeNode rootNode, String leftChild, String rightChild) {
		if(rootNode == null)
			return;
		
		rootNode.leftChild = new TreeNode(leftChild);
		rootNode.rightChild = new TreeNode(rightChild);
	}

	public static void main(String[] args) {
		TreeNode rootNode = new TreeNode("Drinks");
		
		SimpleTreeInsertion(rootNode, "HotDrinks", "ColdDrinks");
		SimpleTreeInsertion(rootNode.leftChild, "Tea", "Coffee");
		SimpleTreeInsertion(rootNode.rightChild, "Cola", "Fanta");

		PreOrderTraversal(rootNode);
	}

	private static void PreOrderTraversal(TreeNode rootNode) {
		if(rootNode == null) {
			return;
		}
		System.out.println(rootNode.data);
		PreOrderTraversal(rootNode.leftChild);
		PreOrderTraversal(rootNode.rightChild);
	}
	
	private static void InOrderTraversal(TreeNode rootNode) {
		if(rootNode == null) {
			return;
		}	
		InOrderTraversal(rootNode.leftChild);
		System.out.println(rootNode.data);
		InOrderTraversal(rootNode.rightChild);
	}

	private static void PostOrderTraversal(TreeNode rootNode) {
		if(rootNode == null) {
			return;
		}
		
		PostOrderTraversal(rootNode.leftChild);
		PostOrderTraversal(rootNode.rightChild);
		System.out.println(rootNode.data);
	}
}

