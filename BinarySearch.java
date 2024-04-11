package ArrayPractice;

public class BinarySearch {
    public static int  subArray(int a[],int key) {
        int start = 0, end = a.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                end--;

            } else {
                start++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,6,9,8,10,11};
        int key=100;
        int index=subArray(a,key);
        if (index==-1){
            System.out.println("Not found");
        }else {
            System.out.println(key+" is found at index of :"+index);
        }

    }
}
