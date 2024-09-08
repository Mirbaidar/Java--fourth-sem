//import java.util.Scanner;
public class Human {

    String message = "Hello World";

    public static void display(Human human){
        System.out.println(human.message);
    }

    public static void main(String[] args) {
        Human kunal = new Human();
        kunal.message = "Kunal's message";
        Human.display(kunal);
    }

} 
/*public class Transposearray {
    public static void transpose(int arr[]){
   }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       System.out.println("Enter the  number of rows:");
       int r = inp.nextInt();
       System.out.println("Enter the number of column:");
       int c = inp.nextInt(); 
       int arr[][]=new int[r][c];
       print(arr);
       inp.close();
    }
    
} */
