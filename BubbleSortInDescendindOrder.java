public class BubbleSortInDescendindOrder {
    public static void bubbling(int num[]){
        for (int i=0;i< num.length;i++){
            for (int j=0;j<num.length-i-1;j++){
                //Swaping
                if (num[j+1]>num[j]){
                    int temp=num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                }

            }
            System.out.println();
            for (int nuum:num){
                System.out.print(nuum+" ");
            }
        }
    }
    public static void printNum(int num[]){
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={3,6,2,1,8,7,4,5,3,1};
        bubbling(num);
        printNum(num);
    }
}
