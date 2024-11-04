public class CeilingOFnumInArr {
    public static void main(String[] args) {
        int arr[] = { 11, 12, 13, 42, 51, 68, 83 };
        int target = 51;
        int ans =binarySearch(arr, target);
        if(arr[ans]==target){
            System.out.println("Numbaer at pos :"+ans+":"+target);
        }else{
            System.out.println("Ceiling of target number :"+arr[ans]);
        }
    }

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if(target > arr[arr.length-1]){
                return -1;
            }
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
                mid = (start + end) / 2;
            }
            if (arr[mid] > target) {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return start;
    }

}
