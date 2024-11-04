import java.util.Scanner;

public class MountainAZrray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        inp.close();
        System.out.println("Elements in array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Peak in mountain array is :" + arr[Peakele(arr)]);

    }

    static int Peakele(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
                mid = start + (end - start) / 2;
               
            } else {
                start = mid + 1;
                mid = start + (end - start) / 2;
              
            }
           
        }

        return start;
    }
}
