import java.util.*;

public class Factroial {
//Binimoial Cofficiant
    public static int billiCofficient(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int  cofficient=a/(b*c);
        return cofficient;
    }
    public static int fact(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
//            System.out.println(f);
        }
        return f;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number that you want to Print the Factroial:");

        int n=sc.nextInt();
        int r=sc.nextInt();
//        System.out.println(fact(n));
        System.out.println(billiCofficient(n,r));


    }


}
