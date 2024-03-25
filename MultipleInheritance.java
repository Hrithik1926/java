package Interfaces;
interface Herbivore{

//void eat();
void teeth();
void nature();


}
interface Carnivore{
    void eat();
    void danger();

}
class M implements Herbivore,Carnivore{
    public static String name;
   public void eat(){
        System.out.println("Meat");

    }
    public void danger(){
        System.out.println("Harmfull");
    }
   public void teeth(){
       System.out.println("Flat");
    }
    public void nature(){
        System.out.println("Saant");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
M m1=new M();
m1.danger();
m1.eat();
m1.teeth();
m1.nature();
        System.out.println(m1.name="Horse");
    }
}
