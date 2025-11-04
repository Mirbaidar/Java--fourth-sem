import  java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("enter the number one: ");
        int x = inp.nextInt();
        System.out.println("enter the number second: ");
        int y = inp.nextInt();
        System.out.println(x+y);
        inp.close();
    }
}
