import java.util.Scanner;

public class FunctionWithParameter {
   public static int calculate(int a,int b){//parameters and Formal Parameters
       int sum =a+b;
       System.out.println("The sum of a and b is:"+sum);
       return sum;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
      int sum= calculate(n1,n2);//arguments and actual parameters
        System.out.println(sum);

    }
}
