public class Searching {
    public static void main(String[] args) {
        int arr[] = {22, 434, 423, 5534, 5546};
        int search = 2000;
        boolean found = false;
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]==search)
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}