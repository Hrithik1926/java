import java.util.Scanner;

public class FunctionOverloadingByUsingDataType {
    public static int multiply(int a,int b){
        return a*b;

    }
    public static float multiply(float a,float b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(multiply(45,642));
        System.out.println(multiply(40.0f,54.32f));
    }


}
