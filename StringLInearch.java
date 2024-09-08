import java.util.Scanner;  
public class StringLInearch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = inp.nextLine();
        System.out.println("Enter the target char to find its index: ");
        char target = inp.next().charAt(0);
        System.out.println(search(str, target));
        inp.close();
    }

    static boolean search(String str, char tar) {
        if (str.length() == 0) {
            System.out.println("String underflow ");
            return false;
        }

        for(char ch :str.toCharArray()){
            if(ch==tar){
                System.out.println("Character found");
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (tar == str.charAt(i)) {
                System.err.println("Index of target char:" + i);
                return true;
            }
        }
        System.out.println("Char not found in string ");
        return false;
    }
}
