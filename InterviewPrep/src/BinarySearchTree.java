
public class BinarySearchTree {

	public class Node {
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if( root == null) {
			root = newNode;
		}
		else {
		Node current = root;
		Node parent;
		while(true) {
			parent = current;
			if(newNode.data < current.data) {
				current = current.left;
				if(current == null) {
					parent.left = newNode;
					break;
				}
			}
			else {
				current = current.right;
				if(current == null) {
					parent.right = newNode;
					break;
				}
			}
		}
	}
	}
	public void inOrder(Node p) {
		if(p!=null) {
			inOrder(p.left);
			System.out.print(p.data+" ");
			inOrder(p.right);
		}
	}
	public void preOrder(Node p) {
		if(p!=null) {
			System.out.print(p.data+" ");
			inOrder(p.left);
			inOrder(p.right);
		}
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(2);
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(7);
		Node p = bst.root;
		bst.inOrder(p);
		System.out.println("");
		bst.preOrder(p);

	}

}
