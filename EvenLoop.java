import java.util.Scanner;
public class EvenLoop {
public static void main(String[] args) {
   Scanner se = new Scanner(System.in);
   System.out.println("Enter the iterator count :  ");
   int Num = se.nextInt();
   int i=1;
   while (i<=Num) {
    System.err.println("hellow world ");
    i++;
    if(i==4){
        
        System.out.println("break");
        continue;
    }
    
   }

   

   se.close(); 
}    
}
