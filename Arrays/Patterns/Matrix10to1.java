package Patterns;
public class Matrix10to1 {
    public static void main(String[] args) {
        int k=10;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(k +" ");
                k--;
            }
            System.out.println( );
        }
    }
}