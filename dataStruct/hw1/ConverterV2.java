public class ConverterV2{

public ConverterV2(){}


	public boolean isOp(char c){

		boolean bool = false;

		if(c=='+'||c=='-'||c=='/'||c=='*'||c=='('||c==')'){

			bool = true;
		}

		return bool;

	}

	public boolean priority(char op1, char op2){
		/*
		if (op1 == '+' || op1 == '-'){
			return !(op2 == '+'|| op2 == '-');
		}
			
		if (op1 == '*' || op1 == '/'){
			return !(op2 == '*'|| op2 == '/');
		}
		if(op1=='('){return false;}

		return false;
			
		*/

		switch(op1){
			case '+':
			case '-':
				return !(op2 == '+'|| op2 == '=' || op2 == '(');
			case '*':
			case '/':
				return (op2 == '/'|| op2 == '*' ||op2 == '^'|| op2 == '(');
			case '^':
				return op2=='(';
			case '(':
				return false;
			default: 
				return false;

		}
	}

	public String convert(String infix){
		
		Stack<Character> stack = new Stack<Character>();
		String postfix = "";
		char[] charAr = infix.toCharArray();
		for(char c : charAr){
			if(isOp(c)){
				if(c == ')'){
					while(!stack.isEmpty() && stack.charPeek()!= '('){postfix+= stack.pop();}
					if(!stack.isEmpty()){stack.pop();}
				}else{
					if(!stack.isEmpty() &&  !priority(c, stack.charPeek())){stack.push(c);}
					else{
						while(!stack.isEmpty() && priority(c, stack.charPeek())){
							Character pop = stack.pop();
							if('('!=pop){
								postfix += pop;
							}
						}
						stack.push(c);
					}
				}
			}else{
				postfix += c;
			}
		}
		while(!stack.isEmpty()){ postfix += stack.pop();}	 
		return postfix;
	}

}
