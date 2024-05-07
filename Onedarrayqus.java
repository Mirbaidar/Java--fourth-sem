import java.util.Scanner;

class InnerOnedarrayqus {
  public  int arr[] = new int[4];
  public  Scanner inp = new Scanner(System.in);

    void takeinp() {
        System.out.println("Enter the elements in array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at position :" + i);
            arr[i] = inp.nextInt();
        }
    }

    void display() {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    void sumele() {
        int sum = 0;
        for (int x : arr) {
            sum = sum + x;
        }
        System.out.println("The sum of array is : " + sum);
    }

    void maximumEle() {
        int max = 0;
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        System.out.println("the maximum elemebnt in array is :" + max);
    }

    void search() {
        System.out.println("Enter the element to be searched : ");
        int element = inp.nextInt();
        int found = -1;
        int loc = 0;

        for (int j = 0; j < arr.length; j++) {
            if (element == arr[j]) {
                found = found + 2;
                loc = loc + j;
                break;
            }
        }

        if (found == 1) {
            System.out.println("element is in array at position :" + loc);
        } else {
            System.out.println("the element is not present in array ");
        }
    }

         void occurance(){
        Scanner inp = new Scanner(System.in);

        System.out.println("enter the number to know its occurance");
        int x= inp.nextInt();
        inp.close();
        int countX=0;
        for(int i=0;i<4;i++){
           if(arr[i]==x){
            countX++;
           }
        }
        System.out.println("Occurance of x : "+countX); 
    }

}

public class Onedarrayqus {
    public static void main(String[] args) {
        System.out.println("............Application Menu............");
        System.out.println("Inputs in array : 1");
        System.out.println("Display : 2");
        System.out.println("Sum elements : 3");
        System.out.println("Mazximum element : 4");
        System.out.println("Search element : 5");
        System.out.println("Element Occurance: 6");
        InnerOnedarrayqus arrayWork = new InnerOnedarrayqus();
        Scanner inp = new Scanner(System.in);
        System.out.println("enter your choice  ");
        int x = inp.nextInt();
        do {

            switch (x) {
                case 2:
                    arrayWork.display();
                    break;
                case 1:
                    arrayWork.takeinp();
                    break;
                case 3:
                    arrayWork.sumele();
                    break;
                case 4:
                    arrayWork.maximumEle();
                    break;
                case 5:
                    arrayWork.search();
                    break;
                case 6:
                   arrayWork.occurance();
                   break;

                default:
                    if (x > 10) {
                        System.out.println("enter the proper choice :");
                    }
                    break;
            }
            System.out.println("enter your choice  ");
            x = inp.nextInt();
        } while (x > 0);

        inp.close();
    }
}
