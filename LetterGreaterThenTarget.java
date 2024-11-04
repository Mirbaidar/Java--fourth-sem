public class LetterGreaterThenTarget {
    public static void main(String[] args) {
        char letters[] = { 'a', 'e', 'f', 'm', 'w' };
        char ch = retuenLetterGreaterThenTarget(letters, 'f');
        System.out.println("the ans is :" + ch);
    }

    static char retuenLetterGreaterThenTarget(char lettes[], char target) {
        int start = 0;
        int end = lettes.length - 1;
       

        while (start <= end) {
           int mid = (start + end) / 2;

            if (target < lettes[mid]) {
                end = mid - 1;

            } else {

                start = mid + 1;

            }
        }
        return lettes[start % lettes.length];
    }

}
