import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks (0 to 100): ");
        int marks = scanner.nextInt();
        if (marks >= 0 && marks <= 40) {
            System.out.println("Result: Fail");
        } else if (marks <= 60) {
            System.out.println("Result: Pass");
        } else if (marks <= 80) {
            System.out.println("Result: Average");
        } else if (marks <= 100) {
            System.out.println("Result: Best");
        } else {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}
