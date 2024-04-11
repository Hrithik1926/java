package DivideAndConquer;

public class Merge {
    //1
    public static void prinN(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");

        }
        System.out.println();
    }
    //2
    public static void mergeSort(int n[],int si,int ei){
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(n,si,mid);
        mergeSort(n,mid+1,ei);
        merge(n,si,mid,ei);
    }
    //3
    public static void merge(int n[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei){
            if (n[i]<=n[j]){
                temp[k]=n[i];
                i++;
            }
            else {
                temp[k]=n[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=n[i++];
        }
        while (j<=ei){
            temp[k++]=n[j++];
        }
        for (k=0,i=si;k<temp.length;i++,k++){
            n[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int n[]={8,6,4,2,9,7};
        mergeSort(n,0,n.length-1);
        prinN(n);
    }
}
