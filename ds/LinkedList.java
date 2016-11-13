package ds;
import ds.LinkedNode;
import java.util.Iterator;

/*
	a linked list class
	a linked list is a series of nodes which 
	are linked together in sequence, eg:
	___________   _________
	|  node   |   |       |
	|  value=2|   |       |
	|  ptr------->|_______|
*/


public class LinkedList {
	private LinkedNode head = null;
	private LinkedNode tail = null;
	
	/*
		add a new node to the end of the linked list
	*/
	public void add(int value) {
		LinkedNode node = new LinkedNode();
		node.setValue(value);
		if (head == null) {
			head = node;
		}
		else if (tail == null) {
			tail = node;
			head.setNext(tail);
		}
		else {
			tail.setNext(node);
			tail = tail.getNext();
		}
	}
	/*
		will return null when at end
	*/
	private LinkedNode current = null;
	private void resetIterator() {
		current = null;
	}
	private LinkedNode iterate() {
		if (current == null) {
			current = head;
		}
		else {
			current = current.getNext();
		}
		return current;
	}
	public boolean testIfPresent(int value) throws Exception {
		this.resetIterator();
		while (true) {
			LinkedNode at = this.iterate();
			if (at == null) {
				return false;
			}
			else if (at.getValue() == value) {
				return true;
			}
		}

	}

	/*
		to implement:
			deleteLast
			deleteByValue
			deleteAllByValue
			insertAfter
			insertFirst
			get (iterative)
			testIfPresent
	*/
	
}
		
