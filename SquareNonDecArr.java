import java.util.Scanner;

public class SquareNonDecArr {
    static int[] ansarr(int arr[]) {
        int ans[] = new int[arr.length];
        int k = 0;
        int i = 0;
        int j = (arr.length - 1);

        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k++] = arr[i] * arr[i];
                i++;
            }else{
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }

        int left = 0;
        int right = ans.length - 1;
        while (left < right) {
            int temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = inp.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        int reans[] = ansarr(arr);

        for (int ele : reans) {
            System.out.print(ele + " ");
        }
        inp.close();
    }

}
