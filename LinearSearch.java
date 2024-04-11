package ArrayPractice;

public class LinearSearch {
    public static int subArray(int n[],int key){
        for (int i=0;i<n.length;i++){
            if (n[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[]={1,5,6,4,3,2,8,9,2,7};
        int key=2;
        int a=subArray(n,key);
        if (a==-1){
            System.out.println(key+" is not found.");
        }else {
            System.out.println(key+" is found at index of :"+a);

        }
    }
}
