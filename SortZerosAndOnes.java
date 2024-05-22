public class SortZerosAndOnes {

    static void print(int arr[]) {
        System.out.println("Array elements before sorting : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }

    static void twoPointerSort(int arr[]) {
        int i = 0;
        int j = arr.length-1;

        while (i < j) {
            if (arr[i]==1 && arr[j]==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] == 0) {
                i++;
            } else if (arr[j]==1){
                j--;
            }
        }
        System.out.println("Array after sort ");
        return;

    }

    static void arraysort(int arr[]) {
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero = countZero + 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < countZero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("The sorted array :");
        return;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1 };
        print(arr);
        twoPointerSort(arr);//two pointer sort 
        // arraysort(arr); simple sort 
        print(arr);
    }

}
