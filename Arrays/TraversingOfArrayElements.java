import java.util.Scanner;
public class TraversingOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a[] = new float[5];
        // Input
        for(int d=0; d<a.length; d++)
        {
            System.out.print("Enter a element:");
            a[d] = sc.nextFloat();
        }
         // Reverse Traversing
        for(int i=a.length-1; i>=0; i--)
        {
            System.out.println(a[i] + " ");
        }
        sc.close();
    }
}
