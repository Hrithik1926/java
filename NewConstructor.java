class S{
    S(){
        System.out.println("This is Non-Parameterized Constructor");
    }
    S(String name){
        System.out.println(name);
    }
    S(String nam,int age){
        System.out.println(nam);
        System.out.println(age);
    }


}
public class NewConstructor {
    public static void main(String[] args) {
        S s1=new S();
        S s2=new S("Ritik");
        S s3=new S("Rupesh",17);
    }
}
