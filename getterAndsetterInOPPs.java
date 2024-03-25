public class getterAndsetterInOPPs {
    public static void main(String[] args) {
       Pen newPen=new Pen();
newPen.setNum(54);
        System.out.println(newPen.getNumber());

newPen.setName("Ritik");
        System.out.println(newPen.getStre());
newPen.setCompany("RRKKPRO");
        System.out.println(newPen.get());
    }
}
class Pen{
    int number;
    private String name;
    private String company;
   int getNumber(){
       return this.number;

   }
   String getStre(){
       return this.name;
   }
   String get(){
       return this.company;
   }
   void setNum(int n){
       this.number=n;
   }
   void setName(String newName){
       this.name=newName;

   }
   void setCompany(String newCompany){
       this.company=newCompany;
   }

    }

