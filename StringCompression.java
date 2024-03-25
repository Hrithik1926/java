public class StringCompression {
    public static String cpmreion(String str){//Time Complixity :-O(n)
        String newStr="";
        for (int i=0;i<str.length();i++){
            Integer counnt=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                counnt++;
                i++;

            }
            newStr+=str.charAt(i);
            if (counnt>1){
                newStr+=counnt.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbabbbbbbbbbbbbbbbbbbbbbbbbbddddddddddddddddddddddddddddddddddddddddddddddddasffffffffffffffffffffffffffffffffffffccccdjjjjjjjjjjjjsjsjsjjs";
        cpmreion(str);
        System.out.println(cpmreion(str));
    }
}
