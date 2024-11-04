public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 55, 88, 109, 222, 344, 455, 666, 756 };
        System.out.println("Position of Element  : " + CheckPpos(arr, 10));
    }

    static int CheckPpos(int arr[], int target) {
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return searchEle(arr, target, start, end);
    }

    static int searchEle(int arr[], int target, int start, int end) {
        int mid = (start + end) / 2;
        while (start < end) {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid;
                mid = (start + end) / 2;
            }
            if (arr[mid] < target) {
                start = mid;
                mid = (start + end) / 2;
            }

        }
        return -1;
    }
}
