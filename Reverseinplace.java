class InnerReverseinplace {
    public int arr[] = { 23, 12, 56, 78, 54, 67 };
    int n = arr.length;
    void reverse() {
        System.out.println("Array before inplace reverse :");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("..............................................");
        System.out.println("Array after inplace reverse :");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

}

public class Reverseinplace {
    public static void main(String[] args) {
        InnerReverseinplace obj = new InnerReverseinplace();
        obj.reverse();
     
    }
}
