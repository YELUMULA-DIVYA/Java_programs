import java.util.Scanner;
public class PosNegZero
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total numbers to be check:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if(num > 0)
            {
                System.out.println("Positive");
            }
            else if(num < 0)
            {
                System.out.println("Negative");
            }
            else
            {
                System.out.println("Zero"); 
            }
        }
    }
}
