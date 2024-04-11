package ArrayPractice;

public class SubArray {
    public static void sub(int n[]){
        int pair=0;
        for (int i=0;i<n.length;i++){
            for (int j=i;j<n.length;j++){
                for (int k=i;k<j;k++){
                    System.out.print(n[k]+" ");
                }
                pair++;
                System.out.println();


            }
            System.out.println();
        }
        System.out.println(pair);
    }
    public static void main(String[] args) {
        int n[]={9,6,8,7,4,6,3,2,1};
        sub(n);
        System.out.println();

    }
}
