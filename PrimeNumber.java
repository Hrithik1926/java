import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int n=2;
        while (n<num){
            if (num%n==0){
                System.out.println("Not prime number");
                break;
            }
            else {
                n=n++;
            }
            System.out.println("Prime Number");
            break;
        }

    }
}
