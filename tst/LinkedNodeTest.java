import org.junit.Test;
import static org.junit.Assert.*;
import ds.LinkedNode;

public class LinkedNodeTest {
	@Test
	public void LinkedNodeTest() {
		LinkedNode ln0 = new LinkedNode(1);
		assertEquals(1, ln0.getValue());
		assertNull(ln0.getNext());
		assertNull(ln0.getPrev());
		LinkedNode ln1 = new LinkedNode(2);
		assertEquals(2, ln1.getValue());
		ln0.setNext(ln1);
		assertEquals(ln1, ln0.getNext());
		assertNull(ln1.getNext());
		assertNull(ln0.getPrev());
	}
}
