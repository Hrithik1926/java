package DivideAndConquer;

public class RotatedArray {
    public static int searchArray(int num[],int si,int ei,int target) {
        if (si>ei){
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (num[mid] == target) {
            return mid;
        }
        if (num[si] <= num[mid]) {
            if (num[si] <= target && target <= num[mid]) {
                return searchArray(num, 0, mid - 1, target);
            } else {
            return searchArray(num, mid + 1, ei, target);

        }
    }
        else {
            if (num[si]<=target && target<=num[mid]){
                return searchArray(num,mid+1,ei,target);
            } else{
            return searchArray(num,0,mid-1,target);
            }
        }

    }

    public static void main(String[] args) {
        int num[]={7,8,9,6,5,4,3,2,1};
        int target;

int t=searchArray(num,0,num.length-1,7);
        System.out.println(t);

    }
}
