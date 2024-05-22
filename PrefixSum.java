import java.util.Scanner;

public class PrefixSum {
    static int[] runningSumArr(int arr[]){
    for(int i=1;i<arr.length;i++){
        arr[i]= arr[i-1]+arr[i];
    }
return arr;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = inp.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
       int ans[]=runningSumArr(arr);
       System.out.println("The Prefix array is asa : ");
       for(int Ele : ans){
        System.out.println(Ele +"  ");
       }
        inp.close();
    }

}
