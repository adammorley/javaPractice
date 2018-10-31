import math.Factorial;
import ds.Node;
import ds.LinkedList;
import ds.LinkedNode;
import ds.Tree;
import ds.HashMap;

public class Program {
	public static void main(String[] args) throws Exception {
		print("hello world!");
		Factorial f = new Factorial();
		int num = f.factorial(3);
		/*LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(2);
		ll.add(3);
		ll.add(4);
		if (ll.testIfPresent(5))
			print("something is wrong");
		if (!ll.testIfPresent(4))
			print("something is wrong");
		if (!ll.testIfPresent(3))
			print("cannot find 3!");
		ll.deleteLast();
		if (ll.testIfPresent(4))
			print("4 did not go away, something is wrong!");
		ll.add(4);
		if (!ll.testIfPresent(4))
            print("cannot find 4, something wrong");
        if (!ll.find(4).equals(4))
            print("it's not 4, something wrong");
        */
        HashMap hm = new HashMap();
        hm.put("cat", "danger");
        String t = hm.get("cat");
        System.out.println(t);

		/*Tree t = new Tree(5);
		if (!t.isStump())
			print("tree broken");
        t.insert(7);
        t.insert(8);
        t.insert(9);*/
		
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}
