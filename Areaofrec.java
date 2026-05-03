import java.util.Scanner;
public class Areaofrec
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter breadth of Rectangle:");
        int breadth = sc.nextInt();
        int area = length*breadth;
        System.out.println("Area of rectangle:" +area);
        sc.close();
    }
}