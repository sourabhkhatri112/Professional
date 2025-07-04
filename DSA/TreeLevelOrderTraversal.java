import java.util.LinkedList;
import java.util.List;
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

		LevelOrderTraversal(rootNode);
	}

	private static void LevelOrderTraversal(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(rootNode == null)	// It means the tree is empty
			return;
		queue.add(rootNode);	// Add the rootNode the queue first
		
		while(!queue.isEmpty()) {	
			TreeNode currentNode = queue.poll();	// Here we are removing element from queue
			System.out.println(currentNode.data);	// Printing the removed element

			// Removed element has LEFT-CHILD ? Yes then ADD to the QUEUE.
			if(currentNode.leftChild != null)	
				queue.add(currentNode.leftChild);
			
			// Removed element has RIGHT-CHILD ? Yes then ADD to the QUEUE.
			if(currentNode.rightChild != null)
				queue.add(currentNode.rightChild);
		}
	}
}

