import math.Factorial;
import ds.Node;
import ds.LinkedList;
import ds.LinkedNode;

public class Program {
	public static void main(String[] args) throws Exception {
		print("hello world!");
		Factorial f = new Factorial();
		int num = f.factorial(3);
		print("factorial 3: " + String.valueOf(num));
		Node n = new Node();
		n.setValue(3);
		print("node value: " + String.valueOf(n.getValue()));
		LinkedNode ln = new LinkedNode();
		ln.setValue(4);
		LinkedNode ln2 = new LinkedNode();
		ln.setNext(ln2);
		ln2.setValue(5);
		if (ln.getNext() != ln2) {
			print("broken");
		}
		print("ln: " + String.valueOf(ln.getValue()));
		print("ln2: " + String.valueOf(ln.getNext().getValue()));
		LinkedList ll = new LinkedList();
		ll.add(2);
		ll.add(3);
		ll.add(4);
		if (ll.testIfPresent(5))
			print("something is wrong");
		if (!ll.testIfPresent(4))
			print("something is wrong");
		if (ll.testIfPresent(3))
			print("found 3!");
		
		
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}
