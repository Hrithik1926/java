import java.util.Scanner;

public class LargestNumberByUsingArray {
    public static int largest(int num[]){
        int Largest=Integer.MIN_VALUE;
        int Smallest=Integer.MAX_VALUE;
        for (int i=0;i< num.length;i++) {
            if (Largest < num[i]) {
                Largest = num[i];
            }
            if (Smallest>num[i]){
                Smallest=num[i];
            }
        }
        System.out.println(Smallest);
return Largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        for (int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
      int l=  largest(num);
        System.out.println(l);
    }
}
