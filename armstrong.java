import java.util.Scanner;
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }
        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
