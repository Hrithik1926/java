import java.util.*;
public class findMaxNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number.");
        int n=sc.nextInt();
        int m=sc.nextInt();
        if (n>m){
            System.out.println("The max num is"+n);
        }
        else {
            System.out.println("The max num is"+m);
        }
    }
}
