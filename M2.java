package Practice7;

import java.util.Scanner;

public class M2 {
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
    public static void  isEven(int n){
        if (n%2==0){
            System.out.println("the Argument is Even");

        }else{

            System.out.println("the Argument is ODD");
        }

    }

    public static void main(String[] args) {

        isEven(8);
    }
}
