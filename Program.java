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
		ll.deleteLast();
		if (ll.testIfPresent(4))
			print("4 did not go away, something is wrong!");
		ll.add(4);
		ll.deleteByValue(3);
		if (ll.testIfPresent(3))
			print("3 did not go away, something is wrong!");

		
		
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}
