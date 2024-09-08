import java.util.ArrayList; 
public class ListArr {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(10);
        list.add(0, 123);
        list.add(3682);
       
        list.add(7347);
        list.add(4683);
        list.add(4792);
        System.out.println("element at place "+ list.get(3)); 
        list.add(278);
       int x= list.size();
       System.out.println(list);
       System.out.println(" size :"+x);
       
      System.out.println(list.reversed());      
    }
}
