package Practice5;

import javax.swing.*;
import java.util.Scanner;

public class Factroial {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int sum = 1;

        int n = input.nextInt();
        for (int i=1;i<=n;i++){
            sum*=i;

        }
        System.out.print("Factroial of n Numbers is :"+sum);
    }
}
