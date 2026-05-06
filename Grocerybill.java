import java.util.Scanner;
public class Grocerybill {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n; //number of items
        double total = 0; // total bill (starts from 0)
        double discount =0; //discount amount
        double finalAmount; //final bill after discount
        System.out.println("Enter number of items:");
        n = sc.nextInt(); //int n is already declared, so here we have to take only n 
        for (int i=1; i<=n; i++)
        {
            double price;
            int quantity;
            System.out.println("\nItem" +i);
            System.out.println("Enter price:");
            price = sc.nextDouble();
            System.out.println("Enter quantity:");
            quantity = sc.nextInt();
            total=total+(price*quantity);
            if (total>1000)
            {
                discount=total*10/100;
            }
            else if (total>500)
            {
                discount = total*5/100;
            }
            else
            {
                discount=0;
            }
            finalAmount = total-discount;
            System.out.println("\nTotal Amount=" +total);
            System.out.println("Discount=" +discount);
            System.out.println("Final amount to pay =" +finalAmount);
        }
    }
}
