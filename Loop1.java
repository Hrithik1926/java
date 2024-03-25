package Practice5;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int num;
       int evensum=0;
       int oddsum=0;
        System.out.print("Enter the Number:");
        num=input.nextInt();
        for (int i=0;i<num;i++){
            if (i%2==0){
                System.out.print(i+" ");
                evensum=evensum+i;
                System.out.println();
            }else {
//                System.out.print(i+" ");
                oddsum=oddsum+i;
                System.out.println();
            }
//            System.out.println();
        }
        System.out.println("Sum of Even Numbers Are:"+evensum);
        System.out.println("Sum of Odd Numbers Are:"+oddsum);
    }
}
