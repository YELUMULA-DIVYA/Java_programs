import java.util.Scanner;
public class Elecbill {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int units;
        double bill=0;
        System.out.println("Enter number of units consumed:");
        units = sc.nextInt();
        if (units<=100)
        {
            bill = units*1;
        }
        else if (units <= 200)
        {
            bill = (100*1)+(units - 100)*2;
        }
        else 
        {
            bill = (100*1)+(100*2)+(units-200)*3;
        }
        System.out.println("Electricity bill= " +bill);
    }
}
