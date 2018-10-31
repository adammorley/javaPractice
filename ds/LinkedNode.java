package ds;
import ds.Node;
import ds.KeyValue;

/*
	nodes which are linked to other nodes
*/
public class LinkedNode extends Node {
	private LinkedNode nextNode = null;
	private LinkedNode prevNode = null;

	public LinkedNode(KeyValue v) {
		super(v);
	}

	public LinkedNode getNext() {
		return nextNode;
	}

	public LinkedNode getPrev() {
		return prevNode;
	}

	public void setNext(LinkedNode node) {
		nextNode = node;
	}
	
	public void setPrev(LinkedNode node) {
		prevNode = node;
	}

}
