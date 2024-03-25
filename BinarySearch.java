import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {//Right Condition in which Start is increase
                start += 1;
            } else {
                end -= 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={2,3,4,6,7,9,14,16,18,19};
        int key=3;
        System.out.println(binarySearch(num,key));
    }
}