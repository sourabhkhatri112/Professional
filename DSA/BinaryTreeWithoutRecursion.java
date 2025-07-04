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
	public static void main(String[] args) {
		
		TreeNode rootNode = new TreeNode("Drinks");
		
		TreeNode hotDrinks = new TreeNode("HotDrinks");
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		
		TreeNode coldDrinks = new TreeNode("ColdDrinks");
		TreeNode cola = new TreeNode("cola");
		TreeNode fanta = new TreeNode("fanta");
		
		rootNode.leftChild = hotDrinks;
		rootNode.rightChild = coldDrinks;
		
		hotDrinks.leftChild = tea;
		hotDrinks.rightChild = coffee;
		
		coldDrinks.leftChild = cola;
		coldDrinks.rightChild = fanta;


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
