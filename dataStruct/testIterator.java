import java.util.*;

public class testIterator{

	public static void main(String[] args){
	
		LinkedList<String> colors = new LinkedList<String>();

		

		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("white");
		colors.add("yellow");
		
		int i = 0;
		for(String e : colors){
		
		//colors.listIterator(i);
		System.out.println(e);
		
		colors.remove(2);
		
		i++;
		
		}

		Iterator iter = colors.iterator();
		
		while(iter.hasNext()){
			String val = iter.next().toString();
			System.out.println(val);
			if(val == "green"){
			iter.remove();
			}
		}

		System.out.println("**************");


		while(iter.hasNext()){
			//System.out.println(val);
		}

		int kk = 0;
		for(String e : colors){
		
			//colors.listIterator(i);
			System.out.println(e);
			kk++;
		
		}

		
	
	}

}
