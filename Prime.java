import java.util.Scanner;

public class Prime {
    public static int prime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0 || n % 3 == 0) {
                System.out.println("Not Prime Number ");
                break;
            } else {
                System.out.println("Prime Number");
                break;
            }
        }
return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prime(n));
    }
}