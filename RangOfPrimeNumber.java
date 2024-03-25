import java.util.Scanner;

public class RangOfPrimeNumber {
  public static boolean isPrime(int n){

      if (n==2){
          return false;
      }
      for (int i=2;i<Math.sqrt(n);i++){
          if (n%2==0||n%3==0){
              return false;
          }
      }
     return true;
  }
  public static boolean rangeOfPrime(int n){
      for (int i=2;i<n;i++){

          if (isPrime(i)){
              System.out.print(i+" ");
              if (i!=4){
                  continue;
              }
          }

          System.out.println();
      }
      return true;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(range(n));
        System.out.println(rangeOfPrime(n));
    }
}