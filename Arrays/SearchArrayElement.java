import java.util.Scanner;
public class SearchArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter an element:");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i=0; i<a.length; i++)
        {
           if( a[i] == search)
           {
            found = true;
            break;
           }
        }
        if(found)
        {
            System.out.println("Element found");
        }
        else
        {
             System.out.println("Element not found");
        }  
        }
    }
