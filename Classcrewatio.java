public class Classcrewatio {
    public static class student {
        String name;
        int rollno;
        double percentage;    
    }
     public static void main(String[] args) {
        student x = new student();
        x.name ="ragav";
        x.rollno = 101;
        x.percentage=87.5;

        student b = new student();
        b.name ="baidar";
        b.percentage = 78.9;
        b.rollno = 102;

        System.out.println(x.name );
        System.out.println(x.percentage);
        System.out.println(x.rollno);

        System.out.println(b.name );
     System.out.println(b.percentage);
        System.out.println(b.rollno);
    }
}
