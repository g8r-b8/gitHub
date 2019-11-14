public class Runner<T>{


public static void main(String[] args){


Stack stack = new Stack();

//stack.push("a");
//stack.push("99");
Integer a=(Integer)6;
stack.push(a);
//stack.push();
//String s = stack.toString();

//System.out.println(s);


SLL sll = new SLL();

sll.add("a");

sll.add("a");
sll.add("a");

sll.remove("a");

//System.out.println(sll.size());
//System.out.println(stack.pop());



ConverterV3 cc = new ConverterV3();

System.out.println("flag");

String ans = cc.convert("a+b*c-d");

System.out.println(ans);

}


}
