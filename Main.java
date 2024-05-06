public class Main {
    int rollNO;
    String name;
    float age ;
    char gender;

    public static void main(String[] args) {
       Main baidar= new Main();
       baidar.age=11;
       baidar.name="bakhat";
       baidar.gender='m';
       baidar.rollNO=409;


       Main zaid = new Main();
       zaid.age=12;
       zaid.gender='f';
       zaid.rollNO=33;
       zaid.name="zaiduu";

       Main seerat = new Main();
       seerat.age=9;
       seerat.age='f';
       seerat.name="Beena shabir ";
       seerat.rollNO=101;

       System.out.println(seerat.name);
       System.out.println(baidar.age);
       System.out.println(zaid.rollNO);
       System.out.println(baidar.name);


    }
}
