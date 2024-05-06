import java.util.Scanner;

class Algebra {
    int sum(int a, int b) {
        return a + b;
    }
}
public class Methods {
        public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the number :");
        int x = inp.nextInt();
        System.out.println("enter the next number : ");
        int y = inp.nextInt();
        inp.close();
        Algebra add = new Algebra();
        System.out.println("the sum of numbers is : " +add.sum(x, y));
        int arr[]={1,4,7,6};
        System.out.println(arr[1]);
    }
}


