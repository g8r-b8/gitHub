import java.util.*;

public class MiniHeap<T extends Comparable<T>>{

	public ArrayList<T> heap;
	public int size;	

	public MiniHeap(){
		this.heap = new ArrayList<T>();
		this.size=0;
	}

	//public MiniHeap(int inty){}

	//public MiniHeap(Class<T> classy){}

	//public MiniHeap(int inty, Class<T> classy){}

	//public MiniHeap(T[] tArray, Class classy){}

	public MiniHeap(ArrayList<T> tArray){
		this.heap = tArray;
		this.size = tArray.size();
	}

	public void insert(T t){}

	public T remove(){
		//GET UR EDGE CASES HERE! FRESH EDGE CASES HERE!
		if(isEmpty()){throw new NoSuchElementException("Heap is empty");}
		//MOVE TO TMP LOCATION
		T min = heap.get(0);
		if(this.size==0){System.out.println("Null Array");}
		else if(this.size==1){
			heap.remove(0);
			this.size=heap.size();
		}
		else if(this.size>=2){
			//MOVE LAST ELEMENT TO TOP OF HEAP
			int tmpIndex = this.size-1;
			//switch place of head and tail
			swap(0,tmpIndex);
			
			//REMOVE old HEAD, now tail ELEMENT SO WE CAN OVERRIDE @@@ array form
			heap.remove(tmpIndex);
			this.size=heap.size();
			//FIX SIZE
			heapifyDown();
			}
		return min;
		
	}

	public void add(T add){
		heap.add(size, add);
		size++;
		heapifyUp();
	}
	
	public boolean isEmpty(){
		return this.size == 0;
	}

	public boolean isFull(){
		//if inserting correctly, is full if we have odd number of node
		return this.size%2==1;
	}

	@Override
	public String toString(){
		String ans = "";
		for(T t: heap){
			ans+=t.toString();
		}
		return ans;
	}

	

	private void heapifyDown(){
		int index = 0;
		while(hasLeftChild(index)){
			int smallerChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index)){
				//NOTE: cmp funct call here
				if(rightChild(index).compareTo(leftChild(index))==-1){
					smallerChildIndex = getRightChildIndex(index);
				}
			}
			//NOTE: cmp funct call here
			if(heap.get(index).compareTo(heap.get(smallerChildIndex))==-1){
				break;
			}else{
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
		}
	}

	private void heapifyUp(){
		int index = size-1;
		while(condition(index)){
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	private boolean condition(int index){
		boolean ans = true;
		if(hasParent(index)==false){ ans = false;}
		if(heap.get(index).compareTo(parent(index))>=0){ ans=false; }
		return ans;
	}

	private int getLeftChildIndex(int parentIndex){
		return 2*(parentIndex+1);
	}

	private int getRightChildIndex(int parentIndex){
		return 2*(parentIndex+2);
	}

	private int getParentIndex(int childIndex){
		return (childIndex-1)/2;
	}

	private boolean hasLeftChild(int index){
		return getLeftChildIndex(index)<this.size;
	}

	private boolean hasRightChild(int index){
		return getRightChildIndex(index)<this.size;
	}

	private boolean hasParent(int index){
		return getParentIndex(index)>=0;
	}

	private T leftChild(int index){
		return heap.get(getLeftChildIndex(index));
	}

	private T rightChild(int index){
		return heap.get(getRightChildIndex(index));
	}

	private T parent(int index){
		return heap.get(getParentIndex(index));
	}

	private void swap(int i1, int i2){
		
		//System.out.println(heap.size());
		T tmp = heap.get(i1);
		heap.set(i1,heap.get(i2));
		heap.set(i2, tmp);
		//hurray for learning new functions!!! fixed a bug too!	
		//System.out.println(heap.size());
	}

	

}

