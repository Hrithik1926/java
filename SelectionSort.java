package ArrayPractice;

public class SelectionSort {
    public static void  selection(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int minimum=i;
            for (int j = i + 1; j < num.length - 1; j++) {
if (num[minimum]>num[j]){
        minimum=j;
}
int temp=num[minimum];
num[minimum]=num[i];
num[i]=temp;
            }
        }
//        return -1;
    }

    public static void printSelectionSort(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String[] args) {


        int num[] = {9, 6, 4, 5, 2, 3, 6, 7, 1, 22, 45, 87, 95, 65};
selection(num);
printSelectionSort(num);

    }
}