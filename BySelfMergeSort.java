package DivideAndConquer;

public class BySelfMergeSort {
    public static void printArray(int num[]){
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int num[],int si,int ei) {
        if (si >= ei) {
return;
        }
            int mid = si + (ei - si) / 2;
            mergeSort(num, si, mid);//left
            mergeSort(num, mid + 1, ei);//right
merge(num,si,mid,ei);
        }


    public static void merge(int num[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei){
            if (num[i]<num[j]){
                temp[k]=num[i];
                i++;
            }else {
                temp[k]=num[j];
                j++;
        }

            k++;


    }
        while (i<=mid){
            temp[k++]=num[i++];
        }
        while (j<=ei){
            temp[k++]=num[j++];
        }
for (k=0,i=si;k<temp.length;k++,i++){
//temp[k]=num[i];
    num[i]=temp[k];
}
    }
    public static void main(String[] args) {
        int num[]={7,2,6,9,4,8,5,1,3};
        mergeSort(num,0,num.length-1);
        printArray(num);

    }
}
