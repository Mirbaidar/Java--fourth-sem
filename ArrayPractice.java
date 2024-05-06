import java.util.Scanner;

public class ArrayPractice {
    public static void print(int arr[]) {
        for (int arrEle : arr) {
            System.out.print(arrEle + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = new int[4];
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        inp.close();
        print(arr);
        int arr2[]=arr;
        print(arr2);
    }
}
