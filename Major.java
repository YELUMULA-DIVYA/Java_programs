import java.util.Scanner;
public class Major{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if (age>=18)
        {
            System.out.println("Major");
        }
        else if (age<18)
        {
            System.out.println("Minor");
        }
        else
        {
            System.out.println("Invalid");
        }
        sc.close();
    }
}