import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SLL<T> implements Iterable<T>{

		

	public class Node{
	
		public T info;
		public Node next;

		public Node(T info, Node next){
			this.info = info;
			this.next = next;	
		}

		public T getData(){
			return this.info;
		}
		
	
	}

	
	public Node head;
	public Node tail;
	public int n;

	public SLL(){
	
		head = null;
		tail = null;
		n = 0;

	}

	public void add(T item){
	
		if(item == null){
			throw new NullPointerException("No item to add to data");
		}
		
		if(!isEmpty()){
			Node prev = tail;
			tail = new Node(item, null);
			prev.next = tail;	
		}
		else{
			head = new Node(item, null);
			tail = head;
		}
		
		n++;

	}

	

	public boolean isEmpty(){
		boolean bool = false;
		if(this.n == 0){
			bool = true;
		} 

		return bool;
	}

	public int size(){
		return this.n;
	}
	

	
	
	public void clear(){
	
		//kinda just never had the opportunity to use one of these things
	/*
		do{
			head = head.next;
		}while(cur.hasNext()!=null);
	*/	

		
		while(!isEmpty()){
		
			head = head.next;
			
		
		}
	}	


	public void insertAt(T element, int index){
		
		//actually really dig this logic right hurrrrrr


		Node cur = head;
		Node prev = head;
		int i = 0;
		while(i<index){
			prev = cur;
			cur = cur.next;
			i++;	

		}	
		
		if(i==index){
			
			Node newNode = new Node(element, cur);
			prev.next = newNode;

		}
	
	}


	public T getNthFromFirst(int index){
		
		
		T ans  = null;
		Node cur = head;
	//	Node prev = head;
		int i = 0;
		while(i < index){
		//	prev = cur;
			cur = cur.next;
			i++;	

		}	
		
		if(i==index){
			
			ans =  cur.info;

		}
		
		return ans;
	
	}

	public T getTailInfo(){
		return tail.info;
	}

	public T getNthFromLast(int index){

		Node cur = head;
		T ans  = null;
		int i = 0;
		int bounds = n - index-1;
		while(i < bounds){
		
			cur = cur.next;
			i++;
		}

		if(i == bounds){
			ans = cur.info;
		}
		
		return ans;
	}

	@Override
	public String toString(){

		Node cur = head;
		String ans = "";	
		int i = 0;
		int size = n;

/*
		while(i<size-1){

			//T data = cur.info;
			String s = cur.toString();
			ans += s;
			ans += " \n";			
			System.out.println(i);
			i++;
			if(cur.next!=null){
				cur = cur.next;
			}
		}
*/

		do{
			T data = cur.info;	
			String s = data.toString();
			ans += s;
			ans += " \n";
						
			System.out.println(i);
			i++;
			if(cur!=null){
				cur = cur.next;
			}
		}while(cur!= null);

		System.out.println("FLAG");
		
		return ans;

	}
/*	
	public Character peakLast(){
		Character i= new Character();
		T data = tail.info;
		if(data instanceof Character){
			i =(Integer) data;
		}
		return i;

	}	
*/
	public void remove(T element){
	
		if(isEmpty()){
			throw new IllegalStateException("No such element to remove.");

		}

		else{
		
			Node prev = head;
			Node cur = head;
			while(cur.next != null || cur == tail ){
				T data = cur.info;	
				if(data.equals(element)){
				
					if(n==1){
						head = null;
						tail = null;
					}

					else if(cur.equals(head)){
						head = head.next;
					}
					else if(cur.equals(tail)){
						tail.next = prev;
						tail.next = null;
					}
					else{
						prev.next = cur.next;
					}
					
					n--;
					break;
				}

			}
			prev = cur;
			cur = prev.next;
				
		}
	}


	public Iterator<T> iterator() {
	
		return new LinkedListIterator();

	}

	public class LinkedListIterator implements Iterator<T>{
	
		public Node cur = head;

		public T next(){
	
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			Node nextNode = cur.next;
			T data = nextNode.getData();
			
			return data;
		}
	
		public boolean hasNext(){
			boolean bool = true;
			
			if(cur.next == null){
				bool = false;
			}
			
			return bool;
		}


		public void remove(){
		
			throw new UnsupportedOperationException("remove not supported by iterator!!");
		
		}

		


	}


	public static void main(String[] args){
	
		//System.out.println("Just some bullshit...");	

	}

}


