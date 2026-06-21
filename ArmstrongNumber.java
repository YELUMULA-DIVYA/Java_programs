import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;
        int sum = 0;

        // Count the number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;

        // Calculate sum of digits raised to power of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        // Check Armstrong Number
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }

        sc.close();
    }
}




/* An Armstrong Number is a number that is equal to the sum of its digits raised to the power of the number of digits.

Armstrong Number Rule
n = 7 digits
3446777 is an Armstrong number if:
3⁷ + 4⁷ + 4⁷ + 6⁷ + 7⁷ + 7⁷ + 7⁷ = 3446777
 */
