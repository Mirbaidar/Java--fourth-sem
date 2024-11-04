public class FirstAndLastPosOfElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 9, 9, 9, };
        int ans[] = TargetsPosttion(arr, 5);
        System.out.println("First position :" + ans[0]);
        System.out.println("Last position :" + ans[1]);

    }

    static int[] TargetsPosttion(int arr[], int target) {
        int ans[] = { -1, -1 };
        int first = FindingStartAndEnd(arr, target, true);
        int last = FindingStartAndEnd(arr, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    static int FindingStartAndEnd(int arr[], int target, boolean first) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
                mid = (start + end) / 2;
            } else if (arr[mid] < target) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                ans = mid;
                if (first) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // System.out.println("pos :"+ans);
        // System.out.println("pos :"+ans);
        return ans;
    }

}
