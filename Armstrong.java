import java.util.Scanner;

public class Armstrong {
    static int total = 0;

    public static int cube(int x) {
        return x * x * x;
    }

    public static void armcube(int y) {
        while (y > 0) {
            int num = y % 10;
            total += cube(num);
            y = y / 10;

        }
        return;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = inp.nextInt();

        armcube(num);
        System.out.println("Dighit wise sum of cubes :" + total);

        if (num == total) {
            System.out.println("the input number " + num + " is Armstrong ");
        }else{
            System.out.println("tht number is not armstrong ");
        }

        inp.close();
    }

}
