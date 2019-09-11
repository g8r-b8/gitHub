//import org.junit.Test;
/**
A class to represent complex numbers and provide a user with a asic arithmatic toolkit.
*/
public class ComplexNumbers{

private float a;
private float b;

/**
Construct a complex number object.
@param The real part of a complex number. Must be a float.
@param The imaginary part of a complex number. Must be a float.

*/
	public ComplexNumbers(float a, float b){
		this.a=a;
		this.b=b;
	}

/**
Return the Strong format of a complex number object.
@return complex toString.
*/
	@Override
	public String toString(){
		return String.format("%.2f+(%.2f)i",this.a,this.b);
	}

	public float getA(){
		return this.a;
	}

	public float getB(){
		return this.b;
	}

/**
Returns sum of 2 complex numbers.
@param Another complex number to add this complex number to.
@return the sum of 2 complex numbers.
*/

	public ComplexNumbers add(ComplexNumbers otherNum){
		float alpha = this.a + otherNum.getA();
		float beta = this.b + otherNum.getB();
		ComplexNumbers sum = new ComplexNumbers(alpha,beta);
	
		return sum;

		//proved: operation space is closed under addition; 
		//reference axioms that define linear vector spaces
	}

/**
Returns sum of 2 complex numbers.
@param Another complex number to subtract this complex number to.
@return the sum of 2 complex numbers.
*/

	public ComplexNumbers subtract(ComplexNumbers otherNum){
		float alpha = this.a - otherNum.getA();
		float beta = this.b - otherNum.getB();
		ComplexNumbers sum = new ComplexNumbers(alpha,beta);
	
		return sum;
		//demonstarted, but not proved: operation is closed under scalar mult.

	}

/**
Returns product of 2 complex numbers.
@param Another complex number to multiply this complex number to.
@return the product of 2 complex numbers.
*/

	public ComplexNumbers multiply(ComplexNumbers otherNum){
		float first = this.a * otherNum.getA();
		float outer = this.a * otherNum.getB();
		float inner = this.b * otherNum.getA();
		float last = this.b * otherNum.getB();
		float iTerm = outer+inner;
		float iSquareProduct = (-1)*last;
		float scalar = iSquareProduct + first;
		ComplexNumbers product = new ComplexNumbers(scalar, iTerm);
	
		return product;

	}

/**
Returns product of 2 complex numbers.
@param Another complex number to divide this complex number to.
@return the product of 2 complex numbers.
*/

	public ComplexNumbers divide(ComplexNumbers denom){

		ComplexNumbers conjugate = new ComplexNumbers(denom.getA(),(-1)*denom.getB()); 
		ComplexNumbers newm = multiply(conjugate);
		ComplexNumbers newDen = multiply(conjugate);
		float newA = newm.getA()/newDen.getA();
		float newB = newm.getB()/newDen.getA();
		ComplexNumbers product = new ComplexNumbers(newA,newB);

		return product;

	}


/**
Returns boolean which represents the equality of 2 complex numbers.
@param Another complex number to compare this complex number to.
@return the result of 2 complex numbers being compared for equaility.
*/


	@Override
	public boolean equals(Object o){
		
		boolean result = false;

		//System.out.println(o.toString()+"\n"+toString());
		String objToString = o.toString();
		String thisToString = toString();


		if (objToString.equals(thisToString)){
			
			result = true;
		}

		return result;
	}




	public static void main(String[] args){

		ComplexNumbers chloe = new ComplexNumbers(1,2);
		ComplexNumbers me = new ComplexNumbers(1,2);

		ComplexNumbers product = chloe.divide(me);

		boolean ye = chloe.equals(me);


		System.out.println(product.toString());
	}
}

//computational math could use this be a proper definition
// for a computational vector space