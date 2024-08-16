import java.util.Scanner;

public class IT24200741Lab4Q1 {
      
       public static void main(String[] args) {
       double num;

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number:");
       num = sc.nextDouble();

       if(num > 0) {
         System.out.println("The number is:Positive");
       }else if(num < 0) {
         System.out.println("The number is:Negative");
       }else {
         System.out.println("The number is Zero.");

              }
       }
}

