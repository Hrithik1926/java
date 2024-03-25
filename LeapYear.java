package Practice4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean x=year%4==0;
        boolean y=year%100!=0;
        boolean z=year%400==0&&year%100==0;
        if (x&&(y||z)){
            System.out.println("Leap Year ");
        }else {
            System.out.println("Not Leap Year");
        }

}}