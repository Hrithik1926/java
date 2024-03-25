class C2{
    int num;
    int age;
    String name;
    int marks[];
//int marks=new int[3];

    C2(){
marks=new int[3];
        System.out.println("this is c2");
    }
    C2(C2 s1){
        marks=new int[3];
        this.marks=s1.marks;

        this.name=s1.name;
        this.age=s1.age;
        this.num=s1.num;

    }
}
public class C1 {
    public static void main(String[] args) {
        C2 s1=new C2();
//        marks=new int[3];
s1.marks[0]=656;
s1.marks[1]=66;
s1.marks[2]=65;


        System.out.println(s1.age=12);
        System.out.println(s1.name="Ritik");
        System.out.println(s1.num=9893251);
        for (int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }

        C2 s2=new C2(s1);
        System.out.println(s2.age=23);
        System.out.println(s2.name="Rupesh");
        System.out.println(s2.num=9854);
        s2.marks[1]=1542;
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
