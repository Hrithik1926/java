package ArrayPractice;

public class MiniSum {
    public static void sum(int num[]){

        int current;
    int miniSum=Integer.MAX_VALUE;
    for (int i=0;i<=num.length;i++){
        for (int j=i;j<=num.length;j++){
            current=0;
            for (int k=i;k<j;k++){
                current+=num[k];
            }
            System.out.print(current+" ");
            if (miniSum<current){
                miniSum=current;
            }
        }
        System.out.println();

    }
        System.out.println("Yhe Max sum Of the Array is :"+miniSum);
}
    public static void main(String[] args) {
        int num[]={9,6,2,-3};
        sum(num);
    }
}

