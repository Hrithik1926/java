public class bubblesinsort {
    public static void bubble(int num[]){
        for (int i=0;i<=num.length-2;i++){
            for (int j=0;j<=num.length-2-i;j++){
                if (num[j]>num[j+1]){
                    int tmp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tmp;
                }
            }
        }
    }
    public static void printArray(int num[]
    ){
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={
                8,4,6,2,6,7,9,21,6,33,1,0,9,88,31
        };
        bubble(num);
        printArray(num);
    }
}
