//Method Overloading
class Claculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
//Method Overriding
class Animalss{
    void eat(){
        System.out.println("Eat anything");
    }
}
class Cats extends Animalss{
    void eat(){
        System.out.println("Drink Milk");
    }
}

public class PolyMorphism {


    public static void main(String[] args) {
//        System.out.println(sum(7,8));
      Claculator c1=new Claculator();
        System.out.println(   c1.sum(4,9));
        System.out.println( c1.sum(8,9,1));
        System.out.println( c1.sum((float) 8.9,(float) 87.3));




        //Method Overriding



        Cats cat1=new Cats();
        cat1.eat();

    }

}
//
