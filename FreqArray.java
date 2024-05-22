import java.util.Scanner;

public class FreqArray {
    static int[] makeFreqArray(int arr[]){
        int Freq[]= new int[100];
        for(int i=0; i<arr.length;i++){
            Freq[arr[i]]=Freq[arr[i]]+1;
        }
        return Freq;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = inp.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }

        int Freq[]=makeFreqArray(arr);
        System.out.println("Enter the number of queries :");
        int query = inp.nextInt();
        while (query>0) {
            System.out.println("Enter the number to be searched:");
            int value= inp.nextInt();
            if(Freq[value] >0){
                System.out.println("yes");

            }else{
                System.out.println("no ");
            }
        }
        inp.close();
    }
}
