import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ScheduleTester<T extends Comparable<T>> {



	//The test tester
	@Test
	public void evaluatesExpression() {
		//Calculator calculator = new Calculator();
		int sum = 1+2+3;
		assertEquals(6, sum);
	}

	@Test
	public void addAndRemoveTester(){
		UnboundedPriorityQueue<T> jared = new UnboundedPriorityQueue<T>();
		Integer one = new Integer(1);
		jared.enqueue(one);
		assertEquals(one, jared.dequeue()); 
	}

	@Test
	public void emptyTester(){
		UnboundedPriorityQueue<Integer> jared = new UnboundedPriorityQueue<Integer>();
		assertEquals(true, jared.isEmpty());
	}

}
