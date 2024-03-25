package Abstraction;
abstract class Animal{
    String color;
    Animal(){
        color="Brown";

    }
    void eat(){
        System.out.println("Eat anything");
    }

    abstract void changeColor();

    abstract void walk();
}
class Horse extends Animal{
    @Override
    void changeColor(){
        color="Black";

    }
    void walk() {
        System.out.println("Run On 4 legs");
    }

}
class Hen extends Animal{
    void changeColor(){
        color="Red";
    }
    void walk(){
        System.out.println("Run on 2 legs");
    }
}


 public class Abstracktion {
    public static void main(String[] args) {


    Horse h=new Horse();
    h.walk();
    h.eat();
        h.changeColor();
        System.out.println(h.color);
    Hen h1=new Hen();
    h1.walk();
    h1.eat();
//        System.out.println(h1.color);
        h1.changeColor();
        System.out.println(h1.color);

}


}