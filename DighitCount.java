import java.util.Scanner;
public class DighitCount {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System .in);
        System.out.println("Enter the number : ");
        int num = inp.nextInt();
        inp.close();
        int sum=0;
        int dighit;
        int i=0;
        while (num!= 0){
            dighit=num%10;
           sum =sum+dighit;
            num=num/10;
            i++;
        }
        System.out.println("Count of dighit : " +i);
        System.out.println("Sum of dighits : " + sum);
    }
    
}
