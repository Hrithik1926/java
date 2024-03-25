import java.util.*;
public class InbuildSortingFunction {
    public static void printSort(Integer num[]){
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer num[]={6,4,8,2,9,1,3,7,5};
      Arrays.sort(num);//Ascending Order
        printSort(num);
      Arrays.sort(num,Collections.reverseOrder());//Descending Order
      printSort(num);
//        System.out.println(num);

    }
}
