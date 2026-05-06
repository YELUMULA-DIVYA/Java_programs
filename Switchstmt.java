import java.util.Scanner;
public class Switchstmt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=10, b=5, n=0;
        System.out.println("Enter operation (Add, Sub, Mult):");
        String oper = sc.next();
        switch(oper)
        {
            case "Add":
                n=a+b;
                break;
            case "Sub":
                if (a>b)
                    n=a-b;
                else
                    n=b-a;
                break;
            case "Mult":
                n=a*b;
                break;
            default:
                System.out.println("Invalid choice!");
        }
        System.out.println("Result:" +n);
    }
}