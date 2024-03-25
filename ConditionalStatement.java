import java.util.*;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age :");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("Your are Adult and You can do Vote in Your Local Elections");
        } else if (age>=11&&age<=17) {
            System.out.println("YOu are teenager not aligable for vote");
        }else if (age>2&&age<=10) {
            System.out.println("YOu are child Know");
        }
        else if (age>=0||age==2) {
            System.out.println("YOu are Baby ");
        }
        else {
            System.out.println("Your are not Adult and You can not do Vote in Your Local Elections");
        }
    }
}
