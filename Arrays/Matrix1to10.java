public class Matrix1to10 {
    public static void main(String[] args) {
        int k=1;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
            System.out.print(k +" ");
            k++;
            }
        System.out.println();
        }
    }
}


/*
Step 1: Create Variable
int k = 1;
k stores numbers from: 1 to 10

Step 2: Outer Loop
for(int i = 1; i <= 4; i++)
Controls: Rows
i	Row
1	first row
2	second row
3	third row
4	fourth row

Step 3: Inner Loop
for(int j = 1; j <= i; j++)
Controls: Columns
How many numbers to print in each row

Understanding Row by Row
>> First Row
i = 1
Inner loop:
j <= 1
Prints:
1
Then:
k++
Now:
k = 2
Second Row
i = 2
Inner loop runs 2 times.
Prints:
2 3
Now:
k = 4
Third Row
Prints:
4 5 6
Fourth Row
Prints:
7 8 9 10


MOST IMPORTANT LINE
System.out.print(k + " ");
Print current value of k.
Then
k++;
Increase number by 1.

Why System.out.println();?
System.out.println();
Moves cursor to next line after each row.

Without this:
1 2 3 4 5 6 7 8 9 10


***Visual Understanding***
Outer Loop
Controls rows
Inner Loop
Controls columns/numbers
Pattern Logic
Row	Numbers
1	1
2	2 3
3	4 5 6
4	7 8 9 10
SIMPLE MEMORY TRICK
Print k
Increase k
Move to next line after row finishes
*/