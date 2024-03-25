public class PrintSubArray {
    public static void subArrays(int num[]){
        int tp=0;
        for (int i=0;i<num.length;i++){
            for (int j=i;j< num.length;j++){
                for (int k=i;k<j;k++){
                    System.out.print(num[k]+" ");

                }
                tp++;
                System.out.println();


            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7};
        subArrays(num);

    }
}
