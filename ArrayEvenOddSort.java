import java.util.Scanner;

public class ArrayEvenOddSort {

    static void print(int arr[]) {
        System.out.println("Array elements before sorting : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }

    static void arraysort(int arr[]) {
        System.out.println("array after sorting : ");
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] % 2 > 0 && arr[j] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 > 0) {
                j--;
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = inp.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements :");
        for (int i = 0; i < arr.length; i++) {
            int value = inp.nextInt();
            arr[i] = value;
        }

        print(arr);
        arraysort(arr);
        print(arr);

        inp.close();
    }
}
