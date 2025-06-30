class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Solution {
	public static Node reverse(Node head) {
		Node previous = null;
		Node current = head;
		
		while(current!=null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		//Node middle = findMiddle(head);
		Node list = reverse(head);
		while(list!=null) {
			System.out.print(list.data + "-->");
			list = list.next;
		}
	}

}
