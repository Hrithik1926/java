package Practice5;

public class Sum {
    public static void main(String[] args) {
        int sum=0;
        int s=0;
        int s1=0;
        int num=13;
        int sum1=1;
        for (int i=1;i<=num;i++){
            sum+=i;
            sum1*=i;
            s-=i;
            s1/=i;
        }
        System.out.println("Sum :"+sum);
        System.out.println("Factroial :"+sum1);
        System.out.println(s);
        System.out.println(s1);
    }
}
