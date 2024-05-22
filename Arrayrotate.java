import java.util.Scanner;

public class Arrayrotate {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the k or elements to be rotated : ");
        int k = inp.nextInt();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        k = k % n;

        System.out.println("Array before rotation :");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");
        int ans[] = new int[n];
        int j = 0;

        for (int i = (n - k); i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < (n - k); i++) {
            ans[j++] = arr[i];
        }

        System.out.println("Array after rotation :");
        for (int Ele : ans) {
            System.out.print(Ele + " ");
        }
        inp.close();
    }
}
