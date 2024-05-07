import java.util.Arrays;
public class arraypakage {
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele +" ");
          }
          System.out.println(" ");
    }
    public static void main(String[] args) {
      int arr[]={12,76,909,53,87};
      print(arr);
      System.out.println(" ");
      int arr2[]=arr.clone();
      print(arr2);
      int arr3[]=Arrays.copyOf(arr2, 3);
      print(arr3);
      int arr4[]=Arrays.copyOfRange(arr3, 1, 3);
      print(arr4);
    }
}
