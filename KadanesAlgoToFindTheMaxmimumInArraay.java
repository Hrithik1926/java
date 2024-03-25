public class KadanesAlgoToFindTheMaxmimumInArraay {
    public static void kadanes(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i< num.length;i++){
            currSum=currSum+num[i];
            if (currSum<0){
                currSum=0;

            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int num[]={-1,-6,7,8,9,-6,-4,-6};
        kadanes(num);
    }
}
