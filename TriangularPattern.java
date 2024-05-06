import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = inp.nextInt();
        inp.close();
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        
    }
}
