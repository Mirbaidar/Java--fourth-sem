import java.util.Scanner;

public class PrefixSufixSum {
    static int totalsum(int arr[]) {
        int sum = 0;
        for (int Ele : arr) {
            sum = sum + Ele;
        }
        return sum;
    }

    static int partition(int arr[]){
        int tsum = totalsum(arr);
        int i = 1;
        while (i < arr.length) {
            arr[i] = arr[i - 1] + arr[i];
            tsum = tsum - arr[i];

            if (arr[i] == tsum) {

                System.out.println("yes done");

                return 1;

            }
            i++;

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = inp.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        int get = partition(arr);
        if (get == 1) {
            System.out.println("Partition complete : ");
        } else {
            System.out.println("The array can not be divided into two parts ");
        }

        inp.close();
    }

}
