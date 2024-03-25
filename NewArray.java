import java.util.Scanner;

public class NewArray {
    public static String  menu(String[] st, String key){
        for (int i=0;i<st.length;i++){
            if (st[i]==key){
                System.out.println(st[i]);
            }
            }

        return key;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String key="Sam";
        String st[]=new String[size];
        for (int i=0;i<size;i++){
            st[i]=sc.nextLine();
        }
        String n=menu(st,key);
        System.out.println(n);
//        for (int i=0;i<size;i++){
//            System.out.println(st[i]);
//        }
//
    }
}
