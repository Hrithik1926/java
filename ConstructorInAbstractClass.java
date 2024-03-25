package Abstraction;
abstract class Animals{
    String color;
    int Height;
    Animals(){
        System.out.println("Animals Constructor.................");
       color="Red";
       Height=5;
    }
    abstract void eat();
    abstract void drink();
    void walk(){
        System.out.println("EveryLiving thing can walk");
    }
}
class Beer extends Animals{
    Beer(){
        System.out.println("Beer Constructor.......................");
    }
    void chanColor(){
        color="Brown";
        Height=4;
    }
    @Override
    void eat() {
        System.out.println("Grass");
    }

    @Override
    void drink() {
        System.out.println("Water");
    }

}
class Tiger extends Animals{
    Tiger(){
        System.out.println("Tiger Constructor");
    }
    @Override
    void drink() {
        System.out.println("Blod.........and Water");
    }

    @Override
    void eat() {
        System.out.println("Meat...........");
    }
    void changesColor(){
        color="Yellow";
        Height=6;
    }
}

public class ConstructorInAbstractClass {
    public static void main(String[] args) {
        Beer b=new Beer();
        b.chanColor();
        System.out.println(b.Height);
        System.out.println(b.color);
        b.drink();
        b.walk();
        b.eat();
        System.out.println("...........########............");
        Tiger t=new Tiger();
        t.changesColor();
        System.out.println(t.color);
        System.out.println(t.Height);
        t.eat();
        t.walk();
        t.drink();
        System.out.println("....................******************...................");
    }
}
