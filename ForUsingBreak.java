public class ForUsingBreak {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
if (i==6) {
    System.out.println("I am in Of the Lopp");
    continue;
}

       /*

*****         BREAK USED IN FOR LOOP


           if (i==6){

                System.out.println("I am Out Of the Lopp");
                break;
            }

            */
            System.out.println(i);
        }
    }
}
