public class MaxSumOfArray {
    public static void maxSumOfArray(int num[]){
        int currentSum;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i< num.length;i++){
            for (int j=i;j< num.length;j++){
                currentSum=0;
                for (int k=i;k<j;k++){
                    currentSum+=num[k];

                }
                System.out.println(currentSum);
                if (maxSum<currentSum){
                    maxSum=currentSum;

                }
            }
        }
        System.out.println("This is the Maximum of the SubArray "+maxSum);
    }
    public static void main(String[] args) {
        int num[]={4,5,-6,7,-8,9};
        maxSumOfArray(num);
        //Time Complexity is o(n3)

    }
}
