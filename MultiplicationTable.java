package Practice5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number in Which you want to print the Table :");
        int sum=1;

        int n=sc.nextInt();
        for (int i=1;i<=10;i++){
          sum=n*i;
            System.out.println(sum);
        }



    }
}
