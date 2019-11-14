import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class RerecursionTester{

	public ArrayList<String> arList = new ArrayList<>();


	@Test
	public void testCompareTo(){

		int ans = Rerecursion.compareTo("a","b");

		assertEquals(-1,ans);
	}

	@Test
	public void testFindMin(){
		arList.add("a");
		arList.add("b");
		arList.add("c");

		String newAns = Rerecursion.findMin(arList);
		assertEquals("a",newAns);
	}
	
}