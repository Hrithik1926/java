package ArrayPractice;

import java.util.Scanner;

public class ParingOfArray {
    public static void pair(int num[]){
        int pairOfArray=0;
        for (int i=0;i<num.length;i++){
            int a=num[i];
            for (int j=i;j<num.length;j++){
                System.out.print("("+a+","+num[j]+")");
                pairOfArray++;
            }
            System.out.println();
        }
        System.out.println(pairOfArray);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        pair(num);
    }
}