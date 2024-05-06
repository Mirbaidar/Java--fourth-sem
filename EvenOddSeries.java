import java.util.Scanner;
public class EvenOddSeries {
public static void main(String[] args) {
    Scanner inp= new Scanner(System.in);
    System.out.println("Enter the count n : ");
    int n = inp.nextInt();
    inp.close();;

    int sum =0;
    for(int i=1;i<=n;i++){
        if(i%2==0){
            sum=sum-i;
        }else{
            sum=sum+i;
        }
    }
    System.out.println("Sum of given series is : "+ sum);
}
    
}