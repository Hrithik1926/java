public class INsertionSort {
    public static void insertionSort(int num[]){//Time Complixity is O(n2);
        for (int i=0;i< num.length;i++){
            int current=num[i];
            int previous=i-1;
            while (previous>=0 && num[previous]>current){
                num[previous+1]=num[previous];
                previous--;
            }
            //Insertion
            num[previous+1]=current;
        }

    }
    public static void pritnInsertion(int num[]){
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={64,99,56,24,5,45,278,545};
insertionSort(num);
pritnInsertion(num);
    }
}
