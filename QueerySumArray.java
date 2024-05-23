import java.util.Scanner;

public class QueerySumArray {

    static int[] prefixsum(int arr[]){
       
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array :");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int arr[] = new int[n+1];
        System.out.println("Enter the array elements :");
        for (int i = 1; i <=n; i++) {
            arr[i] = inp.nextInt();
        }
      int ansarr[]=prefixsum(arr);
      System.out.println("Enter the number of queeries :");
      int q =inp.nextInt();
      while(q>0){
        System.out.println("Enter Queries :");
        int l =inp.nextInt();
        int r = inp.nextInt();
        int sum = ansarr[r]-ansarr[l-1];
        System.out.println(sum+"");
        q--;
      }
     
        inp.close();
    }

}
