import java.util.Scanner;
public class simpleIntrest {
    public static void main(String[] args) {

        System.out.println("Calculation of simple intrest ");
        Scanner finp = new Scanner(System.in);
        System.out.println("Enter the character  ");
        System.out.println("Enter the principal amount ");
        float p = finp.nextFloat();
        System.out.println("Enter the rate of interst");
        float r = finp.nextFloat();
        System.out.println("Enter the time in years");
        float t = finp.nextFloat();
        float simpleIntrest = (p * r * t) / 100;
        System.out.println("simple interst : " + simpleIntrest);
        System.out.print("Total amount : " + (simpleIntrest + p));
        finp.close();
    }

}