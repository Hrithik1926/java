public class BankAccount {
    public static void main(String[] args) {
        NewAccount myAccount=new NewAccount();
        myAccount.name="Ritik";
        myAccount.setPass(879);
    }
}
class NewAccount{
    public String name;
    private int pass;
    void setPass(int newpass){
        newpass=pass;
        System.out.println(newpass);
    }

}
