package DivideAndConquer;

public class QuikSort {
    public static void printArray(int n[]){
        for (int i=0;i< n.length-1;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int n[],int si,int ei){
        if (si>=ei){
            return;
        }
        int pIndex=p(n,si,ei);
        quickSort(n,si,pIndex-1);
        quickSort(n,pIndex+1,ei);


    }
    public static int p(int n[],int si,int ei){
        int privot=n[ei];
        int i=si-1;
        for (int j=si;j<ei;j++){
            if (n[j]<=privot){
                i++;
                int temp=n[j];
                n[j]=n[i];
                n[i]=temp;
            }
        }
        i++;
        int temp=privot;
        n[ei]=n[i];
        n[i]=temp;
return i;
    }
    public static void main(String[] args) {
        int n[]={9,2,6,7,1,8};
        quickSort(n,0,n.length-1);
        printArray(n);

    }
}
