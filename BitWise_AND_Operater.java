public class BitWise_AND_Operater {
    public static void OR_Operater(){
        System.out.println(5|2);
    }
    public static void XOR_Operater(){
        System.out.println(7^2);
    }
    public static void NOT_Operater(){
        System.out.println(~2);
    }
    public static void LeftShit_Operater(){
        System.out.println(5<<2);
    }
    public static void RightShit_Operater(){
        System.out.println(3>>1);
    }
    public static void main(String[] args) {
        System.out.println(9&3);
        OR_Operater();
        NOT_Operater();
        XOR_Operater();
        LeftShit_Operater();
        RightShit_Operater();
    }
}
