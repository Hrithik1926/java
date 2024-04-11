package ArrayPractice;

public class MaxSumOfArray {
    public static void sum(int num[]){
        int current;
        int maxSum=Integer.MIN_VALUE;
//        int miniSum=Integer.MAX_VALUE;
        for (int i=0;i<=num.length;i++){
            for (int j=i;j<=num.length;j++){
                current=0;
                for (int k=i;k<j;k++){
                    current+=num[k];
                }
                System.out.print(current+" ");
                if (maxSum<current){
                    maxSum=current;
                }
            }
            System.out.println();

        }
        System.out.println("Yhe Max sum Of the Array is :"+maxSum);
    }
    public static void main(String[] args) {
        int num[]={9,6,2,-3};
        sum(num);
    }
}
