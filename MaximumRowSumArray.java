public class MaximumRowSumArray {
    public static void main(String[] args) {
        int person[][] = new int[][] { { 12, 2, 2, 3, 4 },
                { 23, 345, 45, 67 },
                { 23, 345, 75, 67 },
                { 2300, 355, 45, 67 } };
      System.out.println( "Highest wealth :"+ HighestWealth(person));
    }

    static int HighestWealth(int person[][]) {
        int max = 0;

        for (int man = 0; man < person.length; man++) {
            int sum = 0;
            for (int accounts = 0; accounts < person[man].length; accounts++) {
                sum = sum + person[man][accounts];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
