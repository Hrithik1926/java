package ArrayPractice;

import java.util.Scanner;

public class StaireCase {
    public static boolean starie(int num[][],int key){
        int row=0;
        int colum=num[0].length-1;
        while (row<= num.length && colum>=0){
            if (key<num[row][colum]){
                colum--;
            } else if (key==num[row][colum]) {
                System.out.println(key+"Key is found at index of :"+num);
                return true;

            }
            else {
                row++;
            }
        }
        System.out.println("Key is not found :");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[][]=new int[2][2];
        int key;
        for (int i=0;i< num.length;i++){
            for (int j=0;j< num.length;j++){
                num[i][j]=sc.nextInt();
            }
        }
        starie(num,6);

    }
}
