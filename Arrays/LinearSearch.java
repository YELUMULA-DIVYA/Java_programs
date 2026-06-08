import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0; i<a.length; i++)
        {
            System.out.print("Enter element: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter a element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i=0; i<a.length; i++)
        {
            if (search == a[i])
            {
                System.out.println("Element found at position " +i);
                found = true;
                break;
            }
        }
            if(!found)
                {
                System.out.print("Element not found");
            }
            sc.close();
        }
    }
