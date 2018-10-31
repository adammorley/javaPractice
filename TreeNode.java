package ds;

/*
	a tree node extends a node, and has a left and right child in addition
	to the inherited values and other elements of Node
*/

class TreeNodeException extends Exception {
    public TreeNodeException(String msg) {
        super(msg);
    }
}

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

    /*
        AVL tree; calculate balance factor
     */
    protected int balanceFactor(TreeNode n) {
        int leftSubtree = height(n.left);
        int rightSubtree = height(n.right);
        return leftSubtree - rightSubtree;
    }

    protected boolean balancedAt(TreeNode n) {
        int b = balanceFactor(n);
        if (b <= 1 || b >= -1) {
            return true;
        }
        return false;
    }

    // calculate max height of two sides
    protected int height(TreeNode n) {
        // recursion
        int height = 1;
        if (n.right == null && n.left == null) {
            return height;
        }
        else if (n.right == null && n.left != null) {
            height += height(n.left);
        }
        else if (n.right != null && n.left == null) {
            height += height(n.right);
        }
        else { // right and left are null
            int right = height(n.right);
            int left = height(n.left);
            if (right > left) {
                height += right;
            }
            else {
                height += left;
            }
        }
        return height;
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
	public int findCount(int v) throws TreeNodeException {
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
			throw new TreeNodeException("broken tree");
		}
	}

	public void insert(int v) throws TreeNodeException {
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
			throw new TreeNodeException("broken tree");
		}
	}
}
