package ds;

/*
	a tree node extends a node, and has a left and right child in addition
	to the inherited values and other elements of Node
*/

public class TreeNode extends Node {
	protected TreeNode left;
	protected TreeNode right;
	protected int count; // the number of times this value has been inserted

	public TreeNode(int n) {
		super(n);
		this.count = 1;
		left = null;
		right = null;
	}

	protected void setLeft(TreeNode n) {
		this.left = n;
	}
	protected void setRight(TreeNode n) {
		this.right = n;
	}

	public boolean isLeaf() {
		if (this.left == null && this.right == null) {
			return true;
		}
		return false;
	}

	public boolean trueIf(int v) {
		if (this.value == v) {
			return true;
		}
		else if (this.value > v && this.left.trueIf(v)) {
			return true;
		}
		else if (this.value < v && this.right.trueIf(v)) {
			return true;
		}
		return false;
	}
	public int findCount(int v) throws Exception {
		if (this.value == v) {
			return this.count;
		}
		else if (this.value > v && this.left == null) {
			return 0;
		}
		else if (this.value > v && this.left != null) {
			return this.left.findCount(v);
		}
		else if (this.value < v && this.right == null) {
			return 0;
		}
		else if (this.value < v && this.right != null) {
			return this.right.findCount(v);
		}
		else {
			throw new Exception("broken tree");
		}
	}

	public void insert(int v) throws Exception {
		if (this.value == v) {
			this.count++;
		}
		else if (this.value > v && this.left == null) {
			this.left = new TreeNode(v);
		}
		else if (this.value > v && this.left != null) {
			this.left.insert(v);
		}
		else if (this.value < v && this.right == null) {
			this.right = new TreeNode(v);
		}
		else if (this.value < v && this.right != null) {
			this.right.insert(v);
		}
		else {
			throw new Exception("broken tree");
		}
	}
}
