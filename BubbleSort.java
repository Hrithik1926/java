package ArrayPractice;

public class BubbleSort {
    public static void bubble(int num[]){
        for (int i=0;i<num.length-1;i++){
            for (int j=0;j< num.length-1-i;j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

            }
        }
        public static void printNum(int num[]){
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        }

    public static void main(String[] args) {
        int num[]={9,6,4,8,5,2,3,7,1,5};
        bubble(num);
        printNum(num);

    }
}
