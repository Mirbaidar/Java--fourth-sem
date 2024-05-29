import java.util.Scanner;

public class TwoDarray {
    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int arr[][] = new int[2][3];
        arr[0][0] = 10;
        arr[0][1] = 11;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 9;
        arr[1][02] = 45;
        System.out.println(arr[0][2]);
        int arr2[][] = { { 2, 3, 4 }, { 2, 4, 5 } };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println(" ");
        }

        int arr3[][] = new int[2][4];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                arr3[i][j] = inp.nextInt();
            }
        }

        print(arr3);

        inp.close();

    }

}
