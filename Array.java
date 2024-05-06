class Arrmethod{
    void demoarray(){
      int arr[]=new int[3];
      arr[0]=23;
      arr[1]=34;
      arr[2]=76;
      
      float wei[] = new float[3];
      wei[0]=32;
      wei[2]=34;
      wei[1]=13;
      for(int i=0;i<3;i++){
        System.out.println(arr[i]);
        System.out.println(wei[i]);
      }
    }
}
public class Array {

    public static void main(String[] args) {
        Arrmethod obj = new Arrmethod();
        obj.demoarray();

    }
}