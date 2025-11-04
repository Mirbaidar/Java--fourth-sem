public class CountRotations {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 1, 3, 4 };
        System.out.println("Array is rotated this much of times :" + findRotations(arr));
    }

    static int findRotations(int arr[]) {
        int pevoit = FindPevoit(arr);
        return pevoit + 1;
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

}
