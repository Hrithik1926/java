public class Acceses_Modifier {
    public static void main(String[] args) {
        UserProfile myUser=new UserProfile();
        System.out.println(myUser.setName("Ritik Meena"));
//        System.out.println(myUser.getName());
        System.out.println(myUser.setAge(22));
//        System.out.println(myUser.getAge());
        System.out.println(myUser.setPass("Sjrr@19102648"));
        System.out.println(myUser.getPass());
        System.out.println(myUser.setNumber(989325151));
        System.out.println(myUser.getNumber());
        System.out.println(myUser);

    }
}
class UserProfile{
   private String name;
  private   int age;
   private int number;
   private String pass;


   String setName(String name){
      return this.name=name;

   }
   String getName(){
       return this.name;
   }
   int setAge(int age){
       this.age=age;
       return age;
   }
   int getAge(){
       return this.age;
   }
    int setNumber(int number){
        this.number=number;
        return number;
    }
    int getNumber(){
        return this.number;
    }
    String setPass(String name){
       return this.name=name;

    }
    String getPass(){
        return this.pass;
    }

}
