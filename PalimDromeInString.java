public class PalimDromeInString {
    //Those Strings that are same from the Start and to the Last
    public static boolean palindrome(String str){
        int n=str.length();
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(n-1-i)){
                //Not Palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racvevcar";
        System.out.println(palindrome(str));
    }
}