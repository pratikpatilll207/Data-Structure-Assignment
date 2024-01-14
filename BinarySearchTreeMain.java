package May;

class BinaryTree {
	static class Node {
		private int data;
		private Node left, right;

		public Node() {
			data = 0;
			left = null;
			right = null;
		}

		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BinaryTree() {
		root = null;
	}

	public void add(int val) {
		Node newNode = new Node(val);
		if (root == null) {
			root = newNode;
			return;
		}

		Node trav = root;
		while (true) 
		{
			if (val < trav.data) 
			{
				if (trav.left != null)
				{	trav = trav.left;}
				else {
					trav.left = newNode;
					return;
				}
			} 
			else {
				if (trav.right != null)
				{
					trav = trav.right;
				} 
				else {
					trav.right = newNode;
					return;
				}

			}
		}
	}

	public void preorder(Node trav) {
		if (trav == null)
			return;

		System.out.print(trav.data + ", ");
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void printOdd(Node trav,int level) {
		if (trav == null)
			{return;}
		
		if(level%2 == 1)
		{System.out.print(trav.data + ", ");}
		
		printOdd(trav.left,level+1);
		printOdd(trav.right,level+1);
	}
public void printOdd()
{
	printOdd(root,1);
}
	

	public void preorder() {
		System.out.println("PRE : ");

		preorder(root);
		System.out.println();
	}

	public void inorder(Node trav) {
		if (trav == null) {
			return;
		}
		inorder(trav.left);
		System.out.print(trav.data + ", ");
		inorder(trav.right);

	}

	public void inorder() {
		System.out.println("IN :");
		inorder(root);
		System.out.println();
	}

	public void postorder(Node trav) {
		if (trav == null) {
			return;
		}
		
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data + ", ");
	}

	public void postorder() {
		System.out.println("POST : ");
		postorder(root);
		System.out.println();
	}

}

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(90);
		t.add(40);
		t.add(80);
		t.add(60);

		t.preorder();
		System.out.println();
		 t.inorder();
		 System.out.println();
		 t.postorder();
		 System.out.print("Printing odd :");
		 t.printOdd();

	}
}