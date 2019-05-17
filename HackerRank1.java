import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HackerRank1 {

    /*
     * Complete the handshake function below.
     */
    static int handshake(int n) {
        /*
         * Write your code here.
         */
         if(n==0||n==1){
             return 0;
         }
       
           int worker = 2;
           int y =1;
            while(worker <= n){
              
              if(worker==n){
                  return y;
              }
                y=worker+y;
                worker++;
            }
        return n;
        
      //  else{ return n;}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = handshake(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}