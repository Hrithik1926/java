package Practice6;

import javax.swing.*;

public class Stars {
    public static void main(String[] args) {
        for (int i=0;i<9;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=9;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
