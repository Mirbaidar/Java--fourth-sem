import java.util.Scanner;;

public class MatrixMultiplication {

  public static void multiply(int arr1[][], int r1, int c1, int arr2[][], int r2, int c2) {
    int res[][] = new int[r1][c2];
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
        for (int k = 0; k < c1; k++) {
          res[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }
   print(res);
  }

  public static void print(int res[][]){
    System.out.println("Enter the elements of first matrix :");
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[i].length; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int r1, c1;
    System.out.println("Enter the rows of first matrix :");
    r1 = inp.nextInt();
    System.out.println("Enter the column of first matrix :");
    c1 = inp.nextInt();
    int arr1[][] = new int[r1][c1];
    System.out.println("Enter the elements of first matrix :");
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        arr1[i][j] = inp.nextInt();
      }
    }

    int r2, c2;
    System.out.println("Enter the rows of second matrix :");
    r2 = inp.nextInt();
    System.out.println("Enter the column of second matrix :");
    c2 = inp.nextInt();
    int arr2[][] = new int[r2][c2];
    System.out.println("Enter the elements of second matrix :");
    for (int i = 0; i < r2; i++) {
      for (int j = 0; j < c2; j++) {
        arr2[i][j] = inp.nextInt();
      }
    }

    if (c1 == r2) {
      multiply(arr1, r1, c1, arr2, r2, c2);
    } else {
      System.out.println("Matrix can not be multiplied becoz dimentions are different :");
    }

    inp.close();
  }
}
