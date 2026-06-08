package Patterns;
public class DiamondSmall {
    public static void main(String[] args) {

        // Upper Part
        for(int i = 1; i <= 3; i++) {

            // Spaces
            for(int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Part
        for(int i = 2; i >= 1; i--) {

            // Spaces
            for(int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}