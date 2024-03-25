import java.util.Scanner;

public class FuctionP1 {
    public static void sum(int a,int b,int c){


        int Average=(a+b+c)/3;
        System.out.println(Average);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sum(a,b,c);

    }
}
