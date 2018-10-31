package ds;

/*
	a tree is a set of nodes arranged in a hirearchical structure.
	at the top is a root node, and each level underneath is a
	set of child nodes.  each node has a left and right child
	which may be null
*/

public class Tree {
	protected TreeNode root;
	
	public Tree(int value) {
		root = new TreeNode(value);
	}
	public boolean isStump() {
		return this.root.isLeaf();
	}
    public void insert(int value) {
        try {
            root.insert(value);
        }
        catch (TreeNodeException e) {
            System.err.println("Tree Node exception: " + e.getMessage());
        }
    }
}
