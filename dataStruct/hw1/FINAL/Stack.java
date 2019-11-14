import java.lang.Character;

public class Stack<T>{

	public SLL list = new SLL(); 
//	public Node head = list.head;	
//	public Node tail = list.tail;	


	public Stack(){

		

	}

	public T pop(){

		int size = list.size();
		T ans =(T) list.getNthFromFirst(size - 1);
		list.remove(ans);
		return ans;	

	}
	
	public Character charPeek(){
	
		//if (list.getTailInfo() instanceof Character){
			Character ccc =(Character) list.getTailInfo();
			return ccc;
		//}
		//else if (list.tail.info == null){return new Character('z');}
		//else return new Character('x');

	}

	public T peak(){

		int size = list.size();
		T ans =(T) list.head.info;
		if(size>0){
			ans =(T) list.getNthFromLast(0);
			//list.remove(ans);
		}
		return ans;	

	}

	
	public void push(T value){

		list.add(value);

	}

	public boolean isEmpty(){

		return list.isEmpty();
	
	}

	public String toString(){
		return list.toString();
	}

	
/*
	public Integer peakLast(){
		return list.peakLast();
	}
*/
}
