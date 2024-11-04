
public class BinaeySearchAlgo {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 5, 66, 77, 88};
    int x = BinarySearch(arr, 66);
    System.out.println("position of target :" +x);
  }


  static int BinarySearch(int arr[], int target) {
    int start = 0;
    int end = (arr.length - 1);

    int mid = (start + end) / 2;

    while (start <= end) {
      if (target < arr[mid]) {
        end = mid - 1;
         mid = (start + end) / 2;
      } 
      if (target>arr[mid]) {
        start = mid + 1;
         mid = (start + end) / 2;

      } if(target == arr[mid]) {
        return mid;
      }
    }
    return -1;
  }
}