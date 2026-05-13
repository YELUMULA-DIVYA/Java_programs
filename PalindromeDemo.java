import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Number Palindrome ----------
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10; //g to get last digit
            reverse = reverse * 10 + digit;
/*“We multiply reverse by 10 to shift its digits one place to the left,
 then add the new digit at the last position.” */
            num = num / 10; //remove last digit
        }
/*2nd iteraation
digit = 12 % 10 = 2
reverse = 1*10 + 2 = 12
num = 12/10 = 1*/

/*third iteration
digit = 1
reverse = 12*10 + 1 = 121
num = 0 */

        if (original == reverse)
            System.out.println(original + " is a Palindrome Number");
        else
            System.out.println(original + " is NOT a Palindrome Number");


        // ---------- String Palindrome ----------
        sc.nextLine(); // clear buffer 
/*After nextInt(), Enter key remains in buffer.
This clears it.
Otherwise string input gets skipped.*/
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
            /* str.length() - 1
“We start from the last index of the string and move backward to read characters in reverse order.”*/ 
{
            rev = rev + str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)) 
        /*equalsIgnoreCase() compares actual text
        Also ignores uppercase/lowercase.*/
            System.out.println(str + " is a Palindrome String");
            else
            System.out.println(str + " is NOT a Palindrome String");
    }
}
/* Take number
↓
Reverse number
↓
Compare original and reverse
↓
Take string
↓
Reverse string
↓
Compare original and reverse */


/* | Concept            | Purpose           |
| ------------------ | ----------------- |
| Scanner            | Input             |
| while loop         | Reverse number    |
| for loop           | Reverse string    |
| % operator         | Get last digit    |
| / operator         | Remove last digit |
| charAt()           | Get character     |
| equalsIgnoreCase() | Compare strings   |
 */