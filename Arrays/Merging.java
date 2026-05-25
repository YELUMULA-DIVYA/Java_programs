//Combining two arrays alternatively (one by one)
import java.util.Scanner;
public class Merging
{
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        //Zigzag Merge
        for(int i=0; i<arr1.length; i++)
        {
            result[index++] = arr1[i];
            result[index++] = arr2[i];
        }
    System.out.println("Zigzag Merged Array:");
    for(int i=0; i<result.length; i++)
    {
        System.out.println(result[i] + " ");
    }
 }
}