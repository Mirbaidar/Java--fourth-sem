import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the number to find factorials :");
        int num = inp.nextInt();
        inp.close();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            System.out.println("Number " + i + ": Fcatorial " + fact);
        }
    }
}
