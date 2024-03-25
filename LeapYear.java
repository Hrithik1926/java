import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Year=sc.nextInt();
        boolean x=(Year%4==0);
        boolean y=(Year%100!=0);
        boolean z=((Year%400==0)&& (Year%100==0));
        if (x && (y||z)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("not Leap year");
        }
    }
}

