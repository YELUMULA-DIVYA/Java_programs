import java.util.Scanner;
public class CountDigits {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    for(int i=0; i<arr.length; i++)
    {
        System.out.println("Enter an element:");
        arr[i] = sc.nextInt();
    }
    int count = 0;
    for(int i=0; i<arr.length; i++)
    {
        int num = arr[i];
        while(num>0)
        {
            count++;
            num = num/10;
        }
    }
    System.out.println("Total number of digits: " + count);
}
}

