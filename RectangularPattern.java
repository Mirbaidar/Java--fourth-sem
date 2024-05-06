import java.util.Scanner;

/**
 * RectangularPattern
 */
public class RectangularPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = inp.nextInt();
        System.out.println("Enter the number of column :");
        int c = inp.nextInt();
        inp.close();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}