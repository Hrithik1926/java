import java.util.Scanner;

public class KeyFindInSorted2DArray {
    public static boolean stairCaseSearchMatrix(int matrix[][],int key){
        int row=0,colum=matrix[0].length-1;
        while (row<= matrix.length&&colum>=0){
            if (key==matrix[row][colum]){
                System.out.println("Key is Found :"+"("+row+","+colum+")");
                return true;

            } else if (key< matrix[row][colum]) {
                colum--;
                
            }
            else{
                row++;
            }
        }
        System.out.println("Key not Found:");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int key=6;
        stairCaseSearchMatrix(matrix,key);
    }
}
