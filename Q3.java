package Practice2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float penprice=6.5f;
        float pencileprice=3.4f;
        float eraserprice=2.8f;
        System.out.println("Enter No of Pen");
        int pen=sc.nextInt();
        System.out.println("Enter No of Pencile");
        int pencile=sc.nextInt();
        System.out.println("Enter No of Eraser");
        int eraser=sc.nextInt();
        double bill=(pen*penprice)+(pencile*pencileprice)+(eraser*eraserprice);
        System.out.println(bill);
        double totalBill=(bill*18/100);
        System.out.println(totalBill);




    }
}
