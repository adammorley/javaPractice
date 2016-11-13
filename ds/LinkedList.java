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
		LinkedNode node = new LinkedNode(value);
		//empty list
		if (head == null) {
			head = node;
		}
		//head allocated, allocate tail
		else if (tail == null) {
			tail = node;
			head.setNext(tail);
			tail.setPrev(head);
		}
		else {
			tail.setNext(node);
			LinkedNode oldTail = tail;
			tail = node;
			tail.setPrev(oldTail);
		}
	}
	/*
		iterating through list
	*/
	private LinkedNode current = null;
	private void resetIterator() {
		current = null;
	}
	private LinkedNode iterateForward() {
		if (current == null) {
			current = head;
		}
		else {
			current = current.getNext();
		}
		return current;
	}
	private LinkedNode iterateBackward() {
		if (current == null) {
			current = tail;
		}
		else {
			current = current.getPrev();
		}
		return current;
	}

	public boolean testIfPresent(int value) throws Exception {
		this.resetIterator();
		while (true) {
			LinkedNode at = this.iterateForward();
			if (at == null) {
				return false;
			}
			else if (at.getValue() == value) {
				return true;
			}
		}

	}
	// pop the tail off and update its pointers to null
	// also set the new tail (the n-1 element of the list)
	// to null for its next pointer
	public LinkedNode deleteLast() {
		LinkedNode oldTail = tail;
		tail.setNext(null);
		oldTail.setNext(null);
		return oldTail;
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
		
