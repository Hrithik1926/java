package Practice1;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of a :");
        int a=sc.nextInt();
        System.out.println("Enter the Value of b :");
        int b=sc.nextInt();
        System.out.println("Enter the Value of c :");
        int c=sc.nextInt();

double Q=((b*b)-(4*a*c));
if (Q>0){
    double r1=((-b+Math.sqrt(Q))/2*a);
    double r2=((+b-Math.sqrt(Q))/2*a);
    System.out.format("Roots are ",r1, r2);
} else if (Q==0) {
double r1=-b/(2.0*a);
    System.out.format("r1 is",r1);
}else {
    System.out.println("Not real root");
}
    }
}
