import java.util.Scanner;
public class BinarySearchInRotatedArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the target to be sanned in rotated array: ");
        int target = inp.nextInt();
        int arr[] = { 7, 8, 9, 10, 11, 0, 1, 2, 5, };
        System.out.println(pevoitBst(arr, target));
      inp.close();
    }

    static int pevoitBst(int arr[], int target) {
        int pevoit = FindPevoit(arr);
        if (pevoit == -1) {
            return binarySearch(arr, 0, arr.length - 1, target);
        }
        if (arr[pevoit] == target) {
            return pevoit;
        }
        if (target >= arr[0]) {
            return binarySearch(arr,0, pevoit - 1, target);
        }

        return binarySearch(arr,pevoit + 1, arr.length - 1,target);

    }

    static int FindPevoit(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearch(int arr[], int start, int end, int target) {
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = end - 1;
                mid = (start + end) / 2;
            }
            if (arr[mid] < target) {
                start = mid + 1;
                mid = (start + end) / 2;
            }

        }

        return -1;
    }

}
