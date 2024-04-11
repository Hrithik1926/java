package ArrayPractice;

public class InsertionSoert {
    public static void insertionSort(int num[]){
        for (int i=0;i<num.length;i++){
            int current=num[i];
            int pervius=i-1;
            while (pervius>=0 && num[pervius]>current){
                num[pervius+1]=num[pervius];
                pervius--;

            }
            num[pervius+1]=current;
        }
    }
    public static void printInsertionSort(int num[]){
        for (int i=0;i< num.length;i++){


        System.out.print(num[i]+" ");
    }
    }
    public static void main(String[] args) {
        int num[]={9,7,5,6,2,3,4,15,8,12,15,36,45,78,8,6,12,15};
        insertionSort(num);
        printInsertionSort(num);
    }
}
