/* Normal For Loop
Uses index
Good when index is needed */
public class SumofArrElements {
    public static void main(String[] args) {
        // Step 1: Declare and initialize array
        int[] arr = {10, 20, 30, 40, 50};
        // Step 2: Variable to store sum
        int sum=0;
         // Step 3: Loop through array and add elements
        for(int i=0; i<arr.length;i++)
        {
            sum += arr[i];
        }
        //Print total sum
        System.out.println("Sum of array elements=" +sum);
    }
}


/* Using Enhanced For Loop (Easy Method)
Directly accesses values
Easier and cleaner */
public class SumArrayEnhanced {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int value : arr) {
            sum = sum + value;
        }

        System.out.println("Sum = " + sum);
    }
}
