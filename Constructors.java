class Animals {
    String name;
    double weight;
    String animalType;
    int count;

    Animals() {
        System.out.println(" ");
        System.out.println("i am default constructor ");
    };

    Animals(String name, double weight, String animalType,int total){
        System.out.println(" ");
        System.out.println("i am paramerterized constructor");
        this.animalType = animalType;
        this.count = total;
        this.name = name;
        this.weight = weight;
        
    };

    Animals(String name, double weight, String animalType) {
        System.out.println(" ");
        System.out.println("i am overloaded  constructor");
        this.animalType = animalType;
        this.name = name;
        this.weight = weight;
       
    };

    Animals(double weight, int count) {
        System.out.println(" ");
        System.out.println("i am another overloaded constructor with only weight and counrt");
        this.count = count;
        this.weight = weight;
        
    };

}

public class Constructors {
    static void print(Animals in){
        System.out.println("Animal type : "+in.animalType);
        System.out.println("Aniaml  count: "+in.count);
        System.out.println("Animal name:"+in.name);
        System.out.println("Aniaml Weight:"+in.weight);
    }
    public static void main(String[] args) {
       
        //Default constructor 
        Animals cat = new Animals();
        cat.animalType ="pet";
        cat.count= 10;
        cat.name ="lana";
        cat.weight= 10.8;
        print(cat);

        //Paramerteized constructor 
        Animals cow = new Animals("cow", 11.3, "domestic",7);
        print(cow);

        //overloaded constuctor
       Animals dog = new Animals("Dog",11.3,"seafty");
       print(dog);

       //another overloaded constructor 
       Animals lamb = new Animals(80.3, 60);
       print(lamb);
    }
}
