class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("Breaths");

    }
}
class Cow extends Animals{
    int height;
    String type;
    void drink(){
        System.out.println("Cow Drink Water");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Cow c1=new Cow();
        System.out.println( c1.color="Red");
        System.out.println(c1.height=54);
        System.out.println(c1.type="Deshi");
        c1.drink();;
        c1.breath();
        c1.eat();


    }
}
