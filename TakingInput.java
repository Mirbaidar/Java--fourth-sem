import java.util.Scanner;

public class TakingInput {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num_1=Sc.nextInt();
    System.out.println("enter the name");
    String name = Sc.next();
    System.out.println(num_1 + name);
    Sc.close();
  }  
}
