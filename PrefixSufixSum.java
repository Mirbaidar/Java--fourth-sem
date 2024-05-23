import java.util.Scanner;

public class PrefixSufixSum {
    static int partition(int arr[]) {
        int sum = 0;
        for (int Ele : arr) {
            sum = sum + Ele;
        }
        return 1;
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

        partition(arr);

        inp.close();
    }

}
