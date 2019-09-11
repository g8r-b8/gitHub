import org.junit.Test;
import static org.junit.Assert.*;


public class ComplexNumbersTester{
	



@Test
public void testAdd(){

float a =(float) 1.0;
float b =(float) 2.0;

ComplexNumbers e1 = new ComplexNumbers(a,b);
ComplexNumbers e2 = new ComplexNumbers(a,b);

ComplexNumbers hardSum = new ComplexNumbers(2*a,2*b);
ComplexNumbers sum = e1.add(e2);

//System.out.println("***************");


assertEquals(true,hardSum.equals(sum));

}



@Test
public void testSutract(){

float a =(float) 1.0;
float b =(float) 2.0;

ComplexNumbers e1 = new ComplexNumbers(a,b);
ComplexNumbers e2 = new ComplexNumbers(a,b);

ComplexNumbers hardSum = new ComplexNumbers(0.0f,0.0f);
ComplexNumbers sum = e1.subtract(e2);

//System.out.println("***************");
assertEquals(true,hardSum.equals(sum));


}

@Test
public void testMultiply(){

float a =(float) 1.0;
float b =(float) 2.0;

ComplexNumbers e1 = new ComplexNumbers(a,b);
ComplexNumbers e2 = new ComplexNumbers(a,b);

ComplexNumbers hardProd = new ComplexNumbers(-3f,4f);
ComplexNumbers prod = e1.multiply(e2);
assertEquals(true, hardProd.equals(prod));

}


@Test
public void testDivision(){
float a =(float) 1.0;
float b =(float) 2.0;

ComplexNumbers e1 = new ComplexNumbers(a,b);
ComplexNumbers e2 = new ComplexNumbers(a,b);

ComplexNumbers hardProd = new ComplexNumbers(1.00f,0.00f);
ComplexNumbers prod = e1.divide(e2);
assertEquals(true, hardProd.equals(prod));
}




}