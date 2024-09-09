public class CountEvenDighits {
    public static void main(String[] args) {
        int[] arr = new int[] { 26,45, 3216,22,345,2334 };

        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int arr[]) {
        int count = 0;
        for (int i : arr) {
            if (Even(i)) {
                count++;
            }

        }
        return count;
    }

    static boolean Even(int num) {
        int countOfDighits = dighits(num);
        return countOfDighits % 2 == 0;
    }

    static int dighits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

}
