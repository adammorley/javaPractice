package ds;
import ds.Node;

/*
	nodes which are in a linked list
*/
public class LinkedNode extends Node {
	private LinkedNode nextNode = null;

	public void setNext(LinkedNode node) {
		nextNode = node;
	}

	public LinkedNode getNext() {
		return nextNode;
	}
}