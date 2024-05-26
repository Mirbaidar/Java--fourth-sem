import java.util.Scanner;

public class MatricxSum {
    static void takeinp() {
        Scanner arrinp = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = arrinp.nextInt();
        System.out.println("Entre the number of column : ");
        int col = arrinp.nextInt();
        System.out.println("Enter the Elements of arr1 : " + col * row);

        int arr1[][] = new int[row][col];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arrinp.nextInt();
            }
        }

        System.out.println("Enter the Elements of arr2 : " + col * row);
        int arr2[][] = new int[row][col];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = arrinp.nextInt();
            }
        }
        sum(arr1, arr2, row, col);
        arrinp.close();
    }

    static void sum(int arr1[][], int arr2[][], int row, int col) {
        int sum[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        print(sum);
        return;
    }

    static void print(int sum[][]) {
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println("...............The matrics sum............ : ");
        takeinp();
        return;
    }

}
