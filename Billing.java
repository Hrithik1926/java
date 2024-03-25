import java.util.*;
public class Billing {
    public static void main(String[] args) {
        float Pricepen=750f;
        float Pricepenile=250f;
        float Priceeraser=350f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Pen:");
        int pen=sc.nextInt();
        System.out.println("Enter the number of Pencile:");
        int penile=sc.nextInt();
        System.out.println("Enter the number of eraser:");
        int eraser=sc.nextInt();
        double bill=(pen*Pricepen)+(Pricepenile)+(Priceeraser*eraser);
        double GST=bill+bill*18/100;
        System.out.println("The Total Amount is: "+bill);
        System.out.println("Include 18% GST :"+GST);
    }
}
