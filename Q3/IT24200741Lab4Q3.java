import java.util.Scanner;

public class IT24200741Lab4Q3 {
		public static void main(String[] args) {
			double num;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			num = sc.nextDouble();
			
			String message = (num > 0) ? "The number is: Positive" :
				  			 (num < 0) ? "The number is: Negative" :
				  			 "The number is Zero.";
			
			System.out.println(message);
		}
}