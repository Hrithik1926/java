import java.util.Scanner;

public class Bit1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ((n&1)==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");

        }
    }
}
