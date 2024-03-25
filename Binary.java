import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int pow=0;
int store=0;
while (n>0){
    int lastN=n%10;
    store=store+(lastN*(int)Math.pow(2,0));
    pow++;
    n=n/10;
}
        System.out.println(n+store);
    }
}
