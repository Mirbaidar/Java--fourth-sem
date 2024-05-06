import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = inp.nextInt();
        inp.close();
        System.out.println("the number is " + num);
        int rev=0;
        int dighit;
        while (num != 0) {
            dighit = num % 10;
            rev = rev * 10 + dighit;
            num = num / 10;
        }
        System.out.println("the reverse number is :"+rev);
    }
}
