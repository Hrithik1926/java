class Studentt{
    String name;
    int rollno;
    int Standard;
    int marks[];
    String password;
//copy constructor
Studentt(Studentt s1){
    this.name=s1.name;
    this.rollno=s1.rollno;
    this.Standard=s1.Standard;
    this.marks=s1.marks;
}

     Studentt() {
         System.out.println("this is constructor");
    }
}
class CopyConstructor{
    public static void main(String[] args) {
        Studentt s1=new Studentt();
        s1.name="Ritik";
        s1.rollno=210092;
        s1.Standard=3;
        s1.password="dskhds";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=90;

        System.out.println();
Studentt s2=new Studentt(s1);
s2.password="ritik";
s2.Standard=4;

        System.out.println(s1.name);
        System.out.println(s1.password);
        System.out.println(s1.rollno);
        System.out.println(s1.Standard);
        System.out.println(s2.Standard);
        System.out.println(s2.password);

        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}