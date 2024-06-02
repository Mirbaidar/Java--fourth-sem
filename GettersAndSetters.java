import oppspakagae.Student;
//Domenstaration of getters and setters with pakages and access modifers 
public class GettersAndSetters {
    public static void print(Student x){
     System.out.println(x.marks);
     System.out.println(x.name);
     System.out.println(x.rollno);
     System.out.println(x.getid());
     
    }
    public static void main(String[] args) {
      Student s1 = new Student();
      s1.marks = 100;
      s1.name = "baidar";
    print(s1);
     
    Student s2 = new Student();
      s2.marks = 99;
      s2.name = "veeru";
      s2.setid(104);
      print(s2);

    
    }
    
}
