import java.util.*;

public class AreaofSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Side of Square:");
        long S=sc.nextLong();
        long Area=S*S;
        System.out.println("Area of Square is:"+Area);
    }
}
