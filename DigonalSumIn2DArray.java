public class DigonalSumIn2DArray {
  public static int  diagonalSum(int num[][]) {
      //Time Complexity is n square

//        int sum=0;
//        for (int i=0;i< num.length;i++){
//            for (int j=0;j<num[0].length;j++){
//                if (i==j){
//                    sum+=num[i][j];
//                } else if (i+j== num.length-1) {
//                    sum+=num[i][j];
//
//                }
//            }
//        }
//        return sum;
//    }
      int sum=0;
      for (int i=0;i<num.length;i++){
          sum+=num[i][i];
          if (i !=num.length-1-i)
             sum+=num[i][num.length-i-1];


      }
      return sum;
  }
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(num) );
    }
}
