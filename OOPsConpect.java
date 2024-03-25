import org.w3c.dom.ls.LSOutput;

public class OOPsConpect {
    public static void main(String[] args) {
Pemn penType=new Pemn();
        System.out.println(penType.color);
        System.out.println(penType.tip);
        penType.setColor();
        Student newStudent=new Student();
        newStudent.name="Ritik";
        System.out.println(newStudent.name);
        newStudent.Activities(18,"Rupesh",11);
        newStudent.run();
    }
}
class Pemn{
    String color="Blue";
    int tip=5;
    void setColor(){
        String newClo="Red";
        int newTip=8;
        System.out.println(newClo);
        System.out.println(newTip);
    }
}
class Student{
    int age;
    String name;
    int Class;
    void run(){
        System.out.println("Stident csn run");
        System.out.println("flipy");
    }
    void Activities(int newAge,String NewName,int NEwClass){
        System.out.println(newAge);
        System.out.println(NEwClass);
        System.out.println(NewName);
    }

}
