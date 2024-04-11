package ArrayPractice;

public class SwapingArray {
    public static void swaoing(int num[]){
        int f=0,e= num.length-1;
        while (f<=e){
            int temp=num[e];
            num[e]=num[f];;
            num[f]=temp;
            f++;
            e--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={5,4,8,6,2,3,1,8,7,5};
        swaoing(num);
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]);
        }
        System.out.println();
    }
}
