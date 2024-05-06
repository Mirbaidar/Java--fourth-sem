import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter the first number : \n");
        int num_1 = Num.nextInt();
        System.out.println("Enter the second number : \n");
        int num_2 = Num.nextInt();
        System.out.println("The sum of numbers is " + (num_1 + num_2));
        Num.close();
    }
}
