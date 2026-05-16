public class Reverse {
    public static void main(String args[])
    {
        int arr[] = {3232, 343, 545, 654, 554};
        System.out.println("Array in Reverse Order: ");
        for(int i = arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
