import java.util.Scanner;
public class SumOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0)
        {
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        System.out.println("Sum of digits:");
        System.out.println(sum);
    }
}

/*
num = 44
sum = 0
digit = 44%10 = 4
sum = 0+4 = 4
num = 44/10 = 4
digit = 4%10 = 4
sum = 4+4 = 8
num = 4/10 = 0
*/

