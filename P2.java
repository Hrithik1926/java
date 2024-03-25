package PracticeOfOPPs;
class Vehicle{
    void print(){
        System.out.println("Parent Class");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Child Class");
    }
}
public class P2 {
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.print();
        Vehicle v1=new Vehicle();
        v1.print();
    }
}
