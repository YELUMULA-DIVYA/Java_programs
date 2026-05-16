public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {2232, 443, 54534, 645543};
        int evenCount=0;
        int oddCount =0;
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
                System.out.println("Even numbers are: " +evenCount);
                System.out.println("Odd numbers are: " +oddCount);

        }
    }
    
