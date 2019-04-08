

import java.util.*;


/*Please dont change class name, Dcoder 
and class must not be public*/

//Compiler version JDK 1.8


class HMU4Primes{ 
public static void main(String args[]){ 
  
  Scanner input = new Scanner(System.in);
  
      int x= input.nextInt();
       while(x>0){
       x--;	
       
       int d=x-1;
       while(d>0){
       //4, 1,1,1
       
       if(d==1){
       
       System.out.println(x) ;
       break;
       }
      else if (x%d==0&&d!=1) {
      //	System.out.println("nah");
      break;
      }
          else{
          //	System.out.println("d--");
          d--;
          }
          }
       }
       
       }
       }
       



       
    
  
  
       //is it prime?
     
       
       
       
      // System.out.println(9%9); is 0
