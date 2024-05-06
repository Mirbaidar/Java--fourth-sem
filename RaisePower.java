import java.util.Scanner;
public class RaisePower {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the number A :");
        int a= inp.nextInt();
        System.out.println("Enter the number B as its raise to power ");
        int b = inp.nextInt();
        inp.close();
        int power=1;
        for(int i=1;i<=b;i++){
            power=power*a;
        }
        System.out.println("Answer : "+power);

    }
}
