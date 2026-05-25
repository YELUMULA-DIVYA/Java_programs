public class Matrix {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++)//rows:How many rows? - 3
        {
            for(int j=1; j<=3; j++)//columns:  What to print in each row? - 1 2 3
            {
                System.out.print(j +" ");
            }
            System.out.println( );
        }
    }
}

/* 
This program uses:
Outer loop → rows
Inner loop → columns
 */

/*
**First Row
Outer loop:
i = 1
Inner loop runs:
1 2 3 4 5
Then:
System.out.println();
moves to next line.

**Second Row
Outer loop:
i = 2
Again inner loop prints:
1 2 3 4 5
Same Process Repeats
Until:
i = 5
 */