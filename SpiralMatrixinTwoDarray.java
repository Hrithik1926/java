import java.util.Scanner;

public class SpiralMatrixinTwoDarray {
    public static void sprialMatrix(int matrix[][]){
        int startRow=0;
        int startColm=0;
        int endRow=matrix.length-1;
        int endColm=matrix[0].length-1;
        while (startRow<=endRow && startColm<=endColm){
            //top
            for (int j=0;j<=endColm;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //Right
            for (int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColm]+" ");
            }
            //Bottom
            for (int j=endColm-1;j>=startColm;j--){
                if (startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //Left
            for (int i=endRow-1;i>=startRow+1;i--){
                if (startColm==endColm){
                    break;
                }
                System.out.print(matrix[i][startColm]+" ");
            }
            startRow++;
            startColm++;
            endColm--;
            endRow--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sprialMatrix(matrix);

    }
}
