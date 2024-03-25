import java.util.*;

public class GreatestNumberUsingIFElseCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of A:");
        int a=sc.nextInt();
        System.out.println("Enter the Value of B:");
        int b=sc.nextInt();
        System.out.println("Enter the Value of C:");
        int c=sc.nextInt();
        if (a>=b && a>=c){
            System.out.println("Greatest number between a,b and c is :"+a);
        } else if (b>a&&b>c) {
            System.out.println("Greatest number between a,b and c is :"+b);

        }else {
            System.out.println("Greatest number between a,b and c is :"+c);
        }

    }
}
