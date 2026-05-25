//Zigzag merging is the process of combining two arrays alternatively by taking elements one by one from each array.
public class ZigzagDifferentSize {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {50, 60};

        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Zigzag merge
        while(i < arr1.length && j < arr2.length) {

            result[k++] = arr1[i++];
            result[k++] = arr2[j++];
        }

        // Remaining elements of arr1
        while(i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // Remaining elements of arr2
        while(j < arr2.length) {
            result[k++] = arr2[j++];
        }

        // Print result
        for(int x = 0; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }
    }
}

/*Applications

Zigzag merging is used in:

Data processing
Queue management
Alternate scheduling
Game turns
Merging streams of data */