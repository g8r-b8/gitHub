public class ConverterV3{

public ConverterV3(){}


        public boolean isOp(char c){

                boolean bool = false;

                if(c=='+'||c=='-'||c=='/'||c=='*'||c=='('||c==')'){
                        bool = true;
                }

                return bool;

        }

        public int priority(char op){
                /*
                if (op1 == '+' || op1 == '-'){
                        return !(op2 == '+'|| op2 == '-');
                }
                        
                if (op1 == '*' || op1 == '/'){
                        return (op2 == '*'|| op2 == '/');
                }
                if(op1=='('){return true;}

                return false;
                */


                switch(op){
                        case '+':
                        case '-':
                                return 1;
                        case '*':
                        case '/':
                                return 2;
           
                }return -1;
        }

        public String convert(String infix){

                Stack<Character> stack = new Stack<Character>();
                String postfix = "";
                char[] charAr = infix.toCharArray();
                for(char c : charAr){
if(!stack.isEmpty()){
System.out.println(stack.charPeek());
}System.out.println(1);

                        if(!isOp(c)){
                                postfix+=c;
                                System.out.println(postfix);
                        }
                        else if(isOp(c)){
				
				if(stack.isEmpty() || priority(c)> priority(stack.charPeek())){
                                	stack.push(c);
				}
                                while(!stack.isEmpty() && priority(c)<= priority(stack.charPeek())){
                                     
					Character pop = stack.pop();
					if(c!='('){
						postfix += stack.pop();
						
					}else{pop=c;}
System.out.println(postfix);
                                }
				stack.push(c);
                        }
                        else if (c == '('){stack.push(c);}
                        else if (c==')'){
                                while(!stack.isEmpty() && stack.charPeek() != '('){
					if(stack.charPeek() == '('){break;}
                                        postfix += stack.pop();
System.out.println(2);
System.out.println(postfix);
                                }
                                
                                if(!stack.isEmpty()){stack.pop();}
                        }
                }
                while(!stack.isEmpty()){
                        postfix += stack.pop();
System.out.println(3);
System.out.println(postfix);
                }
                return postfix;
        }

}
                        
