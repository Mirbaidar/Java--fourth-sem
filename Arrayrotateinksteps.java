import java.util.Scanner;
public class Arrayrotateinksteps {
    static void inplacerotate(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n= arr.length;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of k steps :");
        int k = inp.nextInt();
          k = k%n;
        for(int Ele : arr){
            System.out.print(Ele + " ");
        }
        inp.close();
        System.out.println(" ");
        inplacerotate(arr, 0, n-k-1);
        inplacerotate(arr, n-k, n-1);
        inplacerotate(arr, 0, n-1);

        for(int Ele : arr){
            System.out.print(Ele + " ");
        }
    }
}
