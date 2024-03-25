public class bubbleSorting {
    public static void bubbleSorting(int[] n){
        for (int i=0;i<n.length-1;i++){
            for (int j=0;j<n.length-1-i;j++){
                if (n[j]>n[j+1]){
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }

    }
    public static void bullle(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n[]={6,8,2,4,1,6,88,97,3,7,3};
        bubbleSorting(n);
        bullle(n);


    }
}
