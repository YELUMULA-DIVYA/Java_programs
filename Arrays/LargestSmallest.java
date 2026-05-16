public class LargestSmallest {
    public static void main(String args[]) 
    {
        int[] arr = {10, 2, 3, 44, 5};
        // assume first element is both smallest and largest
        int largest = arr[0]; 
        int smallest = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            // check for largest
            if (arr[i] > largest)
            {
                largest = arr[i];
            }
        // check for smallest
        if(arr[i] < smallest)
        {
            smallest = arr[i]; 
        }
    }
        System.out.println("Largest Element = " +largest);
        System.out.print("Smallest Element = " +smallest);
    }  
}


/*Loop starts
   ↓
Check largest
   ↓
Check smallest
   ↓
Next element
   ↓
Loop ends */