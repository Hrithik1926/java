import java.util.*;

public class PrimeNumberr {
    public static int PrimeNumber(int n) {
        for (int i = 2; i <(n - 1); i++) {
            if (n % 2 == 0 || n%3==0) {
                System.out.println("Not Prime Number ");
break;
            } else {
                System.out.println("Prime Number ");
                break;
            }
        }
        return n;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     int p=   PrimeNumber(n);
        System.out.println(p);
    }

}


