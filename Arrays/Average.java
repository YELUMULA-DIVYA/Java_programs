public class Average {
   public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int sum=0;
    double average; 
    /*after division we get value in decimal points, 
    that's why we use double for average*/
    //Find sum
    for(int i=0; i<arr.length; i++)
        sum += arr[i];
    //Find avg
    average = (double)sum/arr.length;
    /*here wwe perform type casting -- int sum to double sum before division
    So the answer becomes a decimal result instead of integer division */
    System.out.println("Sum = " +sum);
    System.out.println("Average = " +average);
   } 
}
