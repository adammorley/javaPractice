import org.junit.Test;
import static org.junit.Assert.*;
import ds.Node;

public class NodeTest {
	@Test
	public void NodeTest() {
		Node n0 = new Node(1);
		assertEquals(1, n0.getValue());
	}
}
