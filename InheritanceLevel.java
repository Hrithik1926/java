import java.sql.SQLOutput;

public class InheritanceLevel {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.run();
//        d1.legs = 4;
        System.out.println(d1.legs);
        d1.eat();
        d1.bradth();
        d1.walk();

        System.out.println("************************************************************************");


    Shark s1 = new Shark();
    s1.swim();
    s1.twins=8;
        System.out.println(s1.twins);
        s1.eat();
        s1.bradth();
        s1.f2();

        System.out.println("******************************************************************");

        Tuna s2=new Tuna();
        s2.twins=6;
        System.out.println(s2.twins);
        s2.f1();
        s2.eat();
        s2.bradth();
        s2.swim();

        System.out.println("***********************************************************");

        Peacock p1=new Peacock();
        p1.legs=2;
        System.out.println(p1.legs);
        p1.sound();
        p1.eat();
        p1.fly();
        p1.bradth();
//        p1.eat();
        System.out.println("*****************************************************************");

        Cat c1=new Cat();
//        c1.legs=4;
        System.out.println(c1.legs);
        c1.height();
        c1.bradth();
        c1.eat("Milk");

        System.out.println("**********************************************************************");


        Humans h1=new Humans();
        System.out.println(h1.legs);
        h1.Intelligent();
        h1.walk();
        h1.eat();
        h1.bradth();

}
}

    //hybrid
    class Animal{
        void eat(){
            System.out.println("eat");
        }
        void bradth(){
            System.out.println("bradth");
        }
    }
    class Fish extends Animal{
        int twins;

        void swim(){
            System.out.println("Swim");
        }
    }
    class Tuna extends Fish{
        void f1 (){
            System.out.println("It Eat Onliy Small Fish");
        }
    }
    class Shark extends Fish{
        void f2(){
            System.out.println("It esat large fish");
        }
    }
    class Bird extends Animal{
        void fly(){
            System.out.println("Birds are Flying...");
        }
    }
    class Peacock extends Bird{
        int legs;
        void sound(){
            System.out.println("CoCOCOCOOCOC");
        }
    }
    class Mammal extends Animal{
        int legs=4;
        void walk(){
            System.out.println("Walk");
        }
    }
    class Dog extends Mammal{
        void run(){
            System.out.println("Fast");
        }
    }
    class Cat extends Mammal{
    void eat(String name){

        System.out.println(name);
    }
        void height(){
            System.out.println("Small");
        }
    }
    class Humans extends Mammal{
        void Intelligent(){
            System.out.println("So Intelligent");
        }
    }

