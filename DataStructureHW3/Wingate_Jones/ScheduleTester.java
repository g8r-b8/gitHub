import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ScheduleTester<T extends Comparable<T>> {



//The test tester
// Have been having issues with J-Unit so it was 
// crucial to see if the tester was working at all.
	@Test
	public void evaluatesExpression() {
		//Calculator calculator = new Calculator();
		int sum = 1+2+3;
		assertEquals(6, sum);
	}


//tests the is empty function
	@Test
	public void emptyTester(){
		UnboundedPriorityQueue<Integer> jared = new UnboundedPriorityQueue<Integer>();
		assertEquals(true, jared.isEmpty());
	}

//Tests the Enqueue Function
//Note: We know the isEmpty functoin works as tested
//Adds, then checks to see if is empty. 
    @Test
	public void addTester(){
		UnboundedPriorityQueue<T> jared = new UnboundedPriorityQueue<T>();
		T one =(T) new Integer(1);
		jared.enqueue(one);
		assertEquals(false, jared.isEmpty()); 
    }

//Tests the add and remove function simutaniously.
//We know add Tester works, so we ass, then remove, then see if it pops One when dequeuing.
	@Test
	public void addAndRemoveTester(){
		UnboundedPriorityQueue<T> jared = new UnboundedPriorityQueue<T>();
		T one =(T) new Integer(1);
		jared.enqueue(one);
		assertEquals(one, jared.dequeue()); 
	}




}
