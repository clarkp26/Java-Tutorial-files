
public class TreeExample {

	private Node root;
	
	public void addNode(int value,String name) {
		Node newNode = new Node(value,name);
		
		if (root == null) {
			root = newNode;
		}
		else {
			Node FocusNode = root;
			Node parent;
			while(true) {
				parent =FocusNode;
				if (value < FocusNode.value) {
					FocusNode = FocusNode.left;
					if(FocusNode == null) {
						parent.left = newNode;
						return;
					}
				}
				else {
					FocusNode = FocusNode.right;
					if(FocusNode == null);
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public void InOrderTraverse(Node FocusNode) {
		if(FocusNode != null) {
			InOrderTraverse(FocusNode.left);
			System.out.println(FocusNode);
			InOrderTraverse(FocusNode.right);
		}
	}
	public void preOrderTraverse(Node FocusNode) {
		if(FocusNode != null) {
			
			System.out.println(FocusNode);
			preOrderTraverse(FocusNode.left);
			preOrderTraverse(FocusNode.right);
		}
	}
	public void postOrderTraverse(Node FocusNode) {
		if(FocusNode != null) {
			postOrderTraverse(FocusNode.left);
			postOrderTraverse(FocusNode.right);
			System.out.println(FocusNode);
		}
	}
	
	public Node FindNode(int val) {
		Node FocusNode = root;
		
		while( val != FocusNode.value) {
			if(val <FocusNode.value) {
				FocusNode = FocusNode.left;
			}
			else {
				FocusNode = FocusNode.right;
			}
			if(FocusNode == null) {
				return null;
			}
		}
		return FocusNode;
	}
	
	public class Node{
		private int value;
		private String name;
		
		Node left;
		Node right;
		
		Node (int value, String name){
			this.value = value;
			this.name = name;
		}
		public String toString() {
			return value + "   " + name;
		}
	}
	public static void main(String[] args) {
		TreeExample tree = new TreeExample();
		tree.addNode(50, "Boss");
		tree.addNode(25, "Sales Manager");
		tree.addNode(15, "HR Manager");
		tree.addNode(30, "Sales team");
		tree.addNode(75, "employee");
		tree.addNode(85, "janitor");

		tree.InOrderTraverse(tree.root);
		System.out.println("\n\n");
		tree.preOrderTraverse(tree.root);
		System.out.println("\n\n");
		tree.postOrderTraverse(tree.root);
		
		System.out.println(tree.FindNode(15));
	}

}
