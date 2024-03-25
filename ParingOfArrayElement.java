public class ParingOfArrayElement {
    public static void paringElement(int num[]){//Using Nested Loop
        int tp=0;//to find the no of pairs n(n-1)/2
        for (int i=0;i<num.length;i++){
            int n=num[i];
            for (int j=i+1;j< num.length;j++){
                System.out.print("("+n+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        paringElement(num);
    }
}
