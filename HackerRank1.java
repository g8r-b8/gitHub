import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HackerRank1 {

    /*
     * Complete the handshake function below.

At the annual meeting of Board of Directors of Acme Inc, every one starts shaking hands with everyone else in the room. Given the fact that any two persons shake hand exactly once, Can you tell the total count of handshakes?

Input Format 
The first line contains the number of test cases T, T lines follow. 
Each line then contains an integer N, the total number of Board of Directors of Acme.

Output Format

Print the number of handshakes for each test-case in a new line.

Constraints

1 <= T <= 1000 
0 < N < 106

Sample Input

2
1
2
Sample Output

0
1
Explanation

Case 1 : The lonely board member shakes no hands, hence 0. 
Case 2 : There are 2 board members, 1 handshake takes place.
!!

     */
    static int handshake(int n) {
        /*
         * Write your code here.
         */
         if(n==0||n==1){
             return 0;git
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