package Practice6;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt() ;
//        int m=sc.nextInt() ;
        //Square Partten
//        for(int i=0; i<n;i++) {
//            for(int j=0; j<m;j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }



      /*
       BORDER OF STAR

        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

       */


      /*

      Star Priyamid

        int n=sc.nextInt() ;
        for(int i=1; i<n;i++) {
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        int n=sc.nextInt() ;
        for(int i=n; i>=1;i--) {
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

       */
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

