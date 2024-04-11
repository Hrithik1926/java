package DivideAndConquer;

public class QuickSorting {
    public static void printArray(int num[]){
        for (int i=0;i<num.length-1;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int num[],int si,int ei){
        if (si>=ei){
            return;
        }
        int index=partion(num,si,ei);
        quickSort(num,si,index-1);
        quickSort(num,index+1,ei);

    }

    public static int partion(int num[],int si,int ei){
        int privot=num[ei];
        int i=si-1;
        for (int j=si;j<ei;j++){
            if (num[j]<=privot){
                i++;
                int temp=num[j];
                num[j]=num[i];
                num[i]=temp;
            }
        }
        i++;
        int temp=privot;
        num[ei]=num[i];
        num[i]=temp;
return i;
    }
    public static void main(String[] args) {
        int num[]={8,2,6,9,7,3,1,4};
        quickSort(num,0, num.length-1);
        printArray(num);
    }
}
