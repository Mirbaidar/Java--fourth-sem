import java.util.Scanner;

//import java.util.Arrays;
public class LinearSeacrch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the array elements :");
        int arr[] = new int[6];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println("Enter the element to found its index :");
        int ele = inp.nextInt();
        search(arr, ele);
        inp.close();

    }

    static void print(int ans) {
        if (ans == -1) {
            System.out.println("Element not found ");
        } else {
            System.out.println("element found at index : " + ans);
        }
    }

    static int search(int arr[], int target) {
        if (arr.length < 1) {
            System.out.println("the array is underflow ");
            return -1;

        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (target == arr[i]) {
                print(i);
                return i;
            }
        }

        print(-1);
        return -1;
    }

}
