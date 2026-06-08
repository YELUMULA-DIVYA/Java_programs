import java.util.Scanner;
public class CopyElementsFromOneArrToAnotherArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter a element: ");
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        for(int i=0; i<b.length; i++)
        {
        System.out.println(b[i] + " ");
        }
    }
}
