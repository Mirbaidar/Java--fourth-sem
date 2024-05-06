import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = inp.nextInt();

        
        if (num % 2 == 0) {
            System.out.println("the number is even :");
        } else {
            System.out.println("number is odd ");
        }
        System.out.println("Enter the age :");
        int age = inp.nextInt();
        if(age<12){
            System.out.println("Child");
        }else if(age>12 && age<18){
            System.out.println("Teenager");
        }else if(age>18 && age <120){
         System.out.println("oldage");
        }else{
            System.out.println("Enter the valid age ");
        }
        inp.close();
    }
}
