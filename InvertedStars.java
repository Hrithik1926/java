package Practice6;

public class InvertedStars {
    public static void main(String[] args) {
        for (int i=0;i<=9;i++){
            for (int j=9;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
