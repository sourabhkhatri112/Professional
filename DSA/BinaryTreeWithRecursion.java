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
	public static void BuildTree(TreeNode rootNode, String leftChild, String rightChild) {
		if(rootNode == null)
			return;
		
		rootNode.leftChild = new TreeNode(leftChild);
		rootNode.rightChild = new TreeNode(rightChild);
	}


	public static void main(String[] args) {
		TreeNode rootNode = new TreeNode("Drinks");
		
		BuildTree(rootNode, "HotDrinks", "ColdDrinks");
		BuildTree(rootNode.leftChild, "Tea", "Coffee");
		BuildTree(rootNode.rightChild, "Cola", "Fanta");
		
		PrintTree(rootNode);
	}
	
	private static void PrintTree(TreeNode rootNode) {
		if(rootNode == null) {
			return;
		}
		System.out.println(rootNode.data);
		
		PrintTree(rootNode.leftChild);
		PrintTree(rootNode.rightChild);
	}
}

