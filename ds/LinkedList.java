package ds;
import java.util.ArrayList;
import ds.LinkedNode;
import ds.KeyValue;

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
	
    public LinkedList() {
    }
	/*
		add a new node to the end of the linked list
	*/
	public void add(KeyValue kv) {
		LinkedNode node = new LinkedNode(kv);
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
			LinkedNode oldTail = tail;
			tail = node;
			oldTail.setNext(node);
			tail.setPrev(oldTail);
		}
	}

/*    public String find(value) {
        if (testIfPresent(value)) {
            return value;
        }
        else {
            return null;
        }
    }*/
        
	/*
		iterating through list
	*/
	private LinkedNode current = null;
	public LinkedNode resetIterator() {
		current = head;
        return current;
	}
    // this loops forever!
	public LinkedNode iterateForward() {
	    current = current.getNext();
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

	/*public boolean testIfPresent(String value) {
		this.resetIterator();
		while (true) {
			LinkedNode at = this.iterateForward();
			if (at == null) {
				return false;
			}
			else if (at.keyValue().equals(value)) {
				return true;
			}
		}

	}*/
	// pop the tail off and update its pointers to null
	// also set the new tail (the n-1 element of the list)
	// to null for its next pointer
	public LinkedNode deleteLast() {
		LinkedNode oldTail = tail;
		tail = oldTail.getPrev();
		tail.setNext(null);
		oldTail.setNext(null);
		oldTail.setPrev(null);
		return oldTail;
	}

	/*public ArrayList deleteByValue(String v) {
		ArrayList<LinkedNode> deleted = new ArrayList<LinkedNode>();
		// TODO: I really want to add the ability to execute code inside the
		// tester...
		if (this.testIfPresent(v)) {
			this.resetIterator();
			while(true) {
				LinkedNode element = this.iterateForward();
				if (element.get().equals(v)) {
                    LinkedNode next = element.getNext();
                    LinkedNode prev = element.getPrev();
                    prev.setNext(next);
					element.setNext(null);
					element.setPrev(null);
					deleted.add(element);
				}
			}
		}
		return deleted;
	}*/



	/*
		to implement:
			deleteByValue
			deleteAllByValue
			insertAfter
			insertFirst
			get (iterative)
	*/
	
}
		
