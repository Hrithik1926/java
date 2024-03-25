public class MaxSumOfArrayUsingPrefix {
    public static void maxSum(int num[]){
        int currSum=0;
        int manSumm=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for (int i=1;i< prefix.length;i++){
           currSum=0;
           prefix[i]=prefix[i-1]+num[i];
        }
        for (int i=0;i< num.length;i++){
            for (int j=i;j< num.length;j++){
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if (manSumm==currSum){
                    manSumm=currSum;
                }
            }

        }
        System.out.print(manSumm);
    }
    public static void main(String[] args) {
        int num[]={1,2,-3,5,9,8,7,-6};
        maxSum(num);
    }
}
