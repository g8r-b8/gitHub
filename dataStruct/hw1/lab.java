import java.lang.Character;
public class lab{


public static void main(String[] args){

String s = "";
int i = 0;
while(i<8){
s+='a';
i++;
if(i%2==0){break;}
}

System.out.println(s);

SLL<Character> ii = new SLL<Character>();
Character a = new Character('q');

ii.add(a);
System.out.println(ii.getTailInfo());

Stack<Character> stack = new Stack<Character>(); 
stack.push(a);
//stack.push('a');
//stack.push('a');
Character n = stack.charPeek();
System.out.println(n);

}

}
