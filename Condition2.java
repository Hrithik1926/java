package Practice4;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temp=sc.nextInt();
        if (temp>100.0){
            System.out.println("You have a Fever");
        }else {
            System.out.println("you don't have a Fever");
        }
    }
}
