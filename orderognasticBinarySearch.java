public class orderognasticBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 6, 4, 3, 2, 1 };
        int ans = OrderbinarySearch(arr, 12);
        System.out.println("position of element is : " + ans);
    }

    static int OrderbinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        boolean isAsd = false;

        if (arr[start] < arr[end]) {
            isAsd = true;
        }

        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsd == true) {
                if (arr[mid] > target) {
                    end = mid - 1;
                    mid = (start + end) / 2;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                    mid = (start + end) / 2;

                }

            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                    mid = (start + end) / 2;

                }

                if (arr[mid] > target) {
                    start = mid + 1;
                    mid = (start + mid) / 2;
                }

            }

        }

        return -1;
    }
}
