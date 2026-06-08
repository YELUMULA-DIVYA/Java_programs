import java.util.Scanner;
public class OnlineFoodMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== WELCOME TO FOOD CORNER");
        System.out.println("1. Veg biryani - Rs.100\n" "2. Chicken Biryani - Rs\n" "3. Fried Rice\n" "4. Noodles\n" "5.Pizza");
        System.out.println("Enter Item Number:");
        int ItemNum = sc.nextInt();
        System.out.println("Enter Quantity:");
        int Quantity = sc.nextInt();
        int price=0;
        String itemname = "";
        switch (choice)
        {
            case 1: 
            itemname = "Veg biryani";
            break;
            case 2: 
            itemname = "Chicken biryani";
            break;
            case 3: 
            itemname = "Fried Rice";
            break;
            case 4: 
            itemname = "Noodles";
            break;
            case 5: 
            itemname = "Pizza";
            break;
            default:
                System.out.println("Invalid choice!");
                return;
    }
    int totalBill = price*quantity;
    System.out.println("===Bill===");
    System.out.println("Item name: " +itemname, \n "Price: Rs." +price\n "Quantity: " +Quantity\n "Total Bill: " +totalBill);
    System.out.println("Thank you! Visit Again.");
    sc.close();
}
}