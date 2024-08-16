import java.util.Scanner;

public class IT24200741Lab4Q2 {
	public static void main(String[] args) {
		double ex_marks, lab_marks, ex_prec, lab_prec, final_marks;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		ex_marks = sc.nextDouble();
		
		if(ex_marks > 100) {
			System.out.println("Invalid input for exam marks. Terminating program.");
			System.exit(0);
		}else {
			System.out.print("Please enter lab submission marks (out of 100): ");
			lab_marks = sc.nextDouble();
			
			if(lab_marks > 100) {
				System.out.print("Invalid input for lab submission marks. Terminating program.");
				System.exit(0);
			}else {
				System.out.print("Please enter the precentage given for the exam: ");
				ex_prec = sc.nextDouble();
				
				System.out.print("Please enter the precentage given for the exam: ");
				lab_prec = sc.nextDouble();
				
				double precentage = ex_prec + lab_prec;
				
				if(precentage == 100) {
					final_marks = ex_marks * (ex_prec/100) + lab_marks * (lab_prec/100);
					System.out.println();
					System.out.println("Final Exam Mark is : " + final_marks);
				}else {
					System.out.println("The precentage must add up to 100. Terminating program.");
					System.exit(0);
				}
			}
		}
	}
}