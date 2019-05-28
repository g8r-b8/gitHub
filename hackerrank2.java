import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the summingSeries function below.
     */
    static int tMachine(long in){
        int total=0;
        
        int max = (int) in;
        int index = 1;  
        System.out.println("FLAG");
        while(index<=max){
            int iSquared=(int) Math.pow(index,2);
            int iMinus=(index-1);
            int iMS=(int) Math.pow(iMinus,2);
            int result = iSquared-iMS;
            total+= result;
            
            System.out.println(result+"  "+total);
            
            index++;
            
        }
        return total;
    }

    static int modular(int raw){
        int pow = (int) (Math.pow(10,9)+7);
        int mod =(int) (raw)%pow ;
       
    return mod;
    }

    


    static int summingSeries(long n) {
     int t=(int) tMachine(n);
     int ans =(int) modular(t);
       System.out.println(ans);
       return ans;
        /*
         * Write your code here.
         */

    }

    


   
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = summingSeries(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
