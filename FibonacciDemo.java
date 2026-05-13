import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms:"); //print not println beecoz to print in one line itself
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series:");
        for(int i=1; i<=n; i++)
        {
            System.out.println(a+ " " ); 
/*used to print Fibonacci numbers continuously on the same line with spaces between them.”
Print value of a
Print one space " "
Stay on same line */
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
