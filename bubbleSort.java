public class bubbleSort {
    public static void bubble(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1-i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
    public static void pritArray(int array[])
    {
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void bubbles(int array[]){
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={4,8,2,6,1,2,9,7,6,3,10,14,40,55,62};
        bubble(array);
        pritArray(array);

    }
}
