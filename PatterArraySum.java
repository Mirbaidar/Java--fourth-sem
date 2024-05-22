import java.util.Scanner;

class FunPatternArraysum {
    public int arr[] = new int[5];
    Scanner inp = new Scanner(System.in);

    void input() {
        System.out.println("Enter the array elements :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("position " + i + ":");
            arr[i] = inp.nextInt();
            System.out.println("");
        }
    }

    static int firstrepeat(int arr[]) {
        int trepeterdEle = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    trepeterdEle = arr[i];
                }
            }
        }
        return trepeterdEle;
    }

    int maximum() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;

    }

    void uniqueele() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        System.out.println("the unique element in array is :" + ans);
    }

    void targetSum() {
        System.out.println("enter the target sum : ");
        int x = inp.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if ((arr[i] + arr[j]) == x) {
                    count = (count + 1);
                }
            }
        }
        System.out.println("count :" + count);
    }

    void Triplesum() {
        System.out.println("Enter the target to find number of times itcan be found using triplet");
        int x = inp.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == x) {
                        count = count + 1;
                    }
                }
            }
        }
        System.out.println("number of triplets :" + count);
    }

    void print() {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }

}

public class PatterArraySum {
    public static void main(String[] args) {
        FunPatternArraysum obj = new FunPatternArraysum();
        obj.input();
        // obj.targetSum();
        obj.print();

        System.out.println("second maximum : " + obj.maximum());

        System.out.println("first repeat ");
        // obj.Triplesum();
        // obj.uniqueele();
    }
}
