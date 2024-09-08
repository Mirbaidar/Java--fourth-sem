import java.util.Scanner;
class InnerOnedarrayqus {
    public int arr[] = new int[4];
    public Scanner inp = new Scanner(System.in);

    void takeinp() {
        System.out.println("Enter the elements in array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at position :" + i);
            arr[i] = inp.nextInt();
        }
    }

    void checkarraysort() {
        int check = 0;
        for (int i = 0; i < (arr.length-1); i++) {
            if (arr[i] <= arr[i+ 1]) {
                check = check + 0;
            } else {
                check = check + 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Array is sorted : ");

        } else {
            System.out.println("Array is unsorted : ");
        }
    }

    void EleGreaterThenX() {
        System.out.println("Enter the element to find count of elements greater then it: ");
        int x = inp.nextInt();
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[i] > x) {
                count = count + 1;
            }
        }
        System.out.println("Number of elements greater then x :" + count);
    }

    void Lastoccurance() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the element to find its last occurance :");
        int x = inp.nextInt();

        int endpos = -1;
        for (int i = 0; i < 4; i++) {
            if (arr[i] == x) {
                endpos = i;
            }
        }
        inp.close();
        System.out.println("Last occurance :" + endpos);

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

    void occurance() {
        Scanner inp = new Scanner(System.in);

        System.out.println("enter the number to know its occurance");
        int x = inp.nextInt();

        int countX = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[i] == x) {
                countX++;
            }
        }
        System.out.println("Occurance of x : " + countX);
        inp.close();
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
        System.out.println("last occurance of element : 7");
        System.out.println("count elements greater then x:8");
        System.out.println("Check array is sorted or not :");
        InnerOnedarrayqus arrayWork = new InnerOnedarrayqus();
        Scanner inp = new Scanner(System.in);
        System.out.println("enter your choice  ");
        
       
        // InnerOnedarrayqus obj = new InnerOnedarrayqus();
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
                case 7:
                    arrayWork.Lastoccurance();
                case 8:
                    arrayWork.EleGreaterThenX();
                    break;
                case 9:
                    arrayWork.checkarraysort();
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
