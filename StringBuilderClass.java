public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");
        for (char ch='a';ch<='z';ch++){
            str.append(ch);
        }
        System.out.println(str);
        System.out.println(str.length());
        String name="heoolo i am ritik menaa form yht ehsh";
        System.out.println(name.toUpperCase());
    }
}
