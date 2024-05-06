import java.util.Scanner;
public class HollowRctangularPatten {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int r = inp.nextInt();
        System.out.println("enter the number of colunm : ");
        int c= inp.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        inp.close();
        
       
    }
    
}
