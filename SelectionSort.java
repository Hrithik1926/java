public class SelectionSort {
    public static void selectionSort(int num[]){
        for (int i=0;i<num.length-1;i++){
            int minimum=i;
            for (int j=i+1;j< num.length;j++){
                if (num[minimum]>num[j]){
                    minimum=j;
                }
            }
            int temp=num[minimum];
            num[minimum]=num[i];
            num[i]=temp;

        }
    }
    public static void printf(int num[]){
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={5,8,3,9,2,7,6,1};
        selectionSort(num);
printf(num);
    }
}
