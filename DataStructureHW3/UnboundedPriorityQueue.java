public class UnboundedPriorityQueue<T extends Comparable<T>>{

	private MiniHeap<T> miniheap;

	public UnboundedPriorityQueue(){
		this.miniheap = new MiniHeap<T>();
	}

	//size of miniheap 
	public UnboundedPriorityQueue(int x){}

	public void enqueue(T t){
		this.miniheap.add(t);
	}
	
	//SHOULD NOT BE VOID, CHANGED TO MAKE IT COMPILE
	// CANNOT CHANGE T TO COMPARABLE ERROR WHEN TRYNA RET T
	public T dequeue(){
		T tmp = miniheap.remove();
		return tmp;
	}

	public boolean isEmpty(){
		return this.miniheap.isEmpty();
	}

}
