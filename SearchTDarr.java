import java.util.Scanner;

public class SearchTDarr {
    static void Takeinp(int arr[][], int r, int c) {
        Scanner ele = new Scanner(System.in);
        System.out.println("enter the array elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = ele.nextInt();
            }
        }
        ele.close();
    }

    static void Print(int arr[][], int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println( " ");
        }
        System.out.println(" ");
    }

    static void Search(int arr[][], int ele) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == ele) {
                    System.out.println("Element found at position" + i+"  " + j);
                    return;
                }
            }
        }
        System.out.println("Element not found ");
        return;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int row, col;
        System.out.println("enter the number of rows ");
        row = inp.nextInt();
        System.out.println("enter the number of column :");
        col = inp.nextInt();
        System.out.println("Enter the element to serarch :");
        int Element = inp.nextInt();
        
        int arr[][] = new int[row][col];

        // take input of array
        Takeinp(arr, row, col);
        // print
        Print(arr, row, col);
        //search
        
        Search(arr, Element);
        inp.close();
    }

}
