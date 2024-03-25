public class bullesort {
    public static void b(int n[]){
        for (int i=0;i<n.length;i++){
            int swap=0;
            for (int j=0;j<n.length-i-1;j++)
            {
                if (n[j+1]>n[j]){
                    int temp=n[j+1];
                    n[j+1]=n[j];
                    n[j]=temp;
                    swap++;
                    System.out.print("No. of Swaps: "+swap);
                }


            }

            System.out.println();
            for (int nu:n){
                System.out.print(nu+" ");


            }

        }

    }
    public static void printP(int n[]){
        for (int i=0;i<n.length;i++){

            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n[]={9,2,4,6,3};
        b(n);
        System.out.println();
        System.out.print("The Bubble Sort in Descending Order is :" );
        printP(n);
    }
}
