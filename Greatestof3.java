import java.util.Scanner;

public class Greatestof3
 {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) 
            {
            if (a > c) 
                {
                System.out.println("Greatest is: " + a);
            } 
            else 
                {
                System.out.println("Greatest is: " + c);
            }
        } 
        else 
            {
            if (b > c) 
                {
                System.out.println("Greatest is: " + b);
            } 
            else 
                {
                System.out.println("Greatest is: " + c);
            }
        }

        sc.close();
    }
}




