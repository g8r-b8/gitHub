import java.util.*;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T>{

	private BinaryNode<T> root;

	public BinarySearchTree(){
		root = null;
	}

	public BinarySearchTree(T[] seq, T nullSymbol){
			super(seq, nullSymbol);
		}

	private boolean contains(T x, BinaryNode<T> t){

		if(t == null){
			return false;
		}
		
		int result = x.compareTo( t.getData() );

		if(result<0){ return contains(x, t.getLeftNode());}

		else if(result>0){ return contains(x, t.getRightNode());}
	
		else return true;
		
	}	

	public boolean contains(T x){
		return contains(x, root);
	}

	public void remove(T x){
		root = remove(x, root);
	}

	private BinaryNode<T> remove(T x, BinaryNode<T> t){
		if (t == null){
			return t;
		}

		int result = x.compareTo( t.getData() );

		if(result<0){ return remove(x, t.getLeftNode());}

		else if(result>0){ return remove(x, t.getRightNode());}
		
		else if(t.getLeftNode() != null && t.getRightNode() !=null){
			t.setData( findMin(t.getRightNode()).getData() );
			t.setRightNode(remove(t.getData(), t.getRightNode()));
		}

		else{ t = (t.getLeftNode() != null) ? t.getLeftNode() : t.getRightNode();}


		return t;
		
	}

	private BinaryNode<T> findMin(BinaryNode<T> t){
		if(t == null){ return null;}
		else if(t.getLeftNode()==null){ return t;}
		return findMin(t.getLeftNode());
	}

	public void insert(T x){
		root = insert(x, root);
	}

	private BinaryNode<T> insert(T x, BinaryNode<T> t){
		if (t == null){
			return new BinaryNode<T>(x);
		}

		int result = x.compareTo( t.getData() );

		if(result<0){ return insert(x, t.getLeftNode());}

		else if(result>0){ return insert(x, t.getRightNode());}
		
		return t;
		
	}

}
