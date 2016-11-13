package ds;

/*
	a node contains a value
*/

public class Node {
	private int value;
	public Node(int v) {
		value = v;
	}

	protected void setValue(int newValue) {
		value = newValue;
	}
	public int getValue() {
		return value;
	}
}
