import java.util.Scanner;
public class NumberGames{
//main method follows
	public static void main(String[] args){ 
	
	System.out.print("Please think of a number between 1-100");
	
	int guess = 50;	
	for(int attempt=0; attempt<=50; attempt++) { //user is lying if there are over 50 attempts 
		
		System.out.printf("\nIs your number " + guess + "? \nPlease input '1' for yes or '0' for no: ");
		Scanner input = new Scanner(System.in);
		int well = input.nextInt();
		if (well == 1) {
			System.out.printf("\nKnew it! And it only took me %d tries!", attempt);
			break;
		}
		else {
			System.out.printf("\nDang, ok... Is your number higher or lower than %d?\nPlease input '1' for higher' or '0' for lower: ", guess);
			Scanner help = new Scanner(System.in);
			int operator = help.nextInt();
			if (operator == 1) {
				guess =(int) (guess*(3/2));
			}
			else {
				guess =(int) (guess*(.5));
			}
		}
	}
	}	
}