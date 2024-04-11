package ArrayPractice;

import java.util.Scanner;

public class SprialMatrix {
    public static void matrix(int num[][]) {
        int startRow = 0;
        int startColum = 0;
        int endRow = num.length - 1;
        int endColum = num[0].length - 1;
        while (startRow <= endRow && startColum <= endColum) {
            //top
            for (int j = 0; j <=endColum; j++) {
                System.out.print(num[startRow][j]+" ");
            }
            //Right
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(num[i][endColum]+" ");
            }
            //Bottom
            for (int j = endColum - 1; j >= startColum; j--) {
                if (startRow==endRow){
                    break;
                }
                System.out.print(num[endRow][j]+" ");

            }
            //Left
            for (int i =endRow-1; i>=startRow+1; i--) {
                if (startColum==endColum){
                    break;
                }
                System.out.print(num[i][startColum]+" ");
            }
            startRow++;
            startColum++;
            endColum--;
            endRow--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[][]=new int[3][3];
        for (int i=0;i< num.length;i++){
            for (int j=0;j< num.length;j++){
                num[i][j]=sc.nextInt();
            }
        }
        matrix(num);
    }
}
