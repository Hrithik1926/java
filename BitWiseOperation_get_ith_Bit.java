public class BitWiseOperation_get_ith_Bit {
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if ((n&1<<i)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearBitMask(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int updateBitMask(int n,int i,int newBit){
      /*  if (newBit==0){
            return clearBitMask(n,i);
        }else{
            return setIthBit(n,i);
        }

       */
        n=clearBitMask(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }
    //Q1
    //Clear
    public static int clearIthBit(int n,int i){
        int bitMask=(~0<<i);
        return n&bitMask;
    }
    public static int clearRangeInBits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMAsk=a|b;
        return n&bitMAsk;
    }

    ///Check the number is the power of 2 or not
    public static boolean checkTheNumberPower(int n){
        return (n & (n-1))==0;
    }

    public static int countTheSetBitInThenuMNER(int n){
        int count=0;
        while (n>0) {
            if ((n & 1) != 0) {
                count++;

            }
            n = n >> 1;
        }
        return count;
    }
    public static double  fastExponent(long a,long n){
        double ans=1;
        while(n>0){
            if ((n&1)!=0){
            ans=a*ans;
        }
         a=a*a;
         n=n>>1;
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(4,3));
        System.out.println(clearBitMask(8,7));
        System.out.println(updateBitMask(9,2,3 ));
        System.out.println(clearIthBit(15,2));
        System.out.println(clearRangeInBits(166,4,8));
        System.out.println(checkTheNumberPower(9));
        System.out.println(11<<5);
        System.out.println(147>>3);
        System.out.println(countTheSetBitInThenuMNER(7));
        System.out.println(fastExponent(457,457));
    }
}
