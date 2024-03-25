import java.util.Scanner;

public class LinearSearch {
   /* public static int linear(int num[],int key){
        for (int i=0;i<num.length;i++){
            if (num[i]==key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,5,40,6,3,9,5,6,5,4,7,6,65,654,4,4595};
        int key=65;
        int index=linear(num,key);
        if (index==-1){
            System.out.println("not found");
        }else {
            System.out.println(index);
        }

    }

    */



    public static int linear(int num[],int key){

        for (int i=0;i<num.length;i++){
            if (num[i]==key){
                return i;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int num[]=new int[n];
       int key=10;
       for (int i=0;i<n;i++){
           num[i]=sc.nextInt();
       }
       linear(num,key);
       int index=linear(num,key);
       if (index==-1){
           System.out.println("Not Found");
       }else{
           System.out.println(index);
       }
   }
    }

