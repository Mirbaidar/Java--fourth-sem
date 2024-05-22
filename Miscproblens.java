
class InnerMiscproblens {
    void swap(int num1, int num2) {
        System.out.println("numbers before swaping ");
        System.out.println("a :" +num1);
        System.out.println("b" +num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("numbers after swaping ");
        System.out.println("a :"+num1);
        System.out.println("b"+num2);
    }

}

public class Miscproblens {
    static void mathswap(int a, int b){
        System.out.println("Numbers before swaping using sum and difference :");
        System.out.println("A:"+a+"B:"+b);
        a=a+b;
        b=a-b;
        a= a-b;
        System.out.println("Numbers after swaping using sum and difference :");
        System.out.println("A:"+a+"B:"+b);
    }

    static int[] arrReverse(){
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Elements before reverseing an array :");
        for(int ele:arr){
            System.out.println(ele);
        }
        int n = arr.length;
        int j=0;
        int ansArr[]=new int[n];
        for(int i=n-1;i>=0;i--){
         ansArr[j++]=arr[i];
        }
        return ansArr;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 99;mathswap(a, b);
        int arr3[]=arrReverse();
        System.out.println("Elements after reverseing an array :");
        for(int ele:arr3){
            System.out.println(ele);
        }
        
     // InnerMiscproblens pro1=new InnerMiscproblens();
     // pro1.swap(a, b);

    }

}
