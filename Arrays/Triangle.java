public class Triangle {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}


/*
i=1
j=1; 1<=1 --- 1
j++(2); 2<=1 (false)
i++(2)
i=2
j=1; 1<=2(T) -- 1
j++(2)
j=2; 2<=2(T) -- 2
O/P:
1
1 2

then
j++(3)
j=3; 3<=2(F) -- new line
i++ ................................................
*/