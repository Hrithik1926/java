public class BuyAndSellStocks {
    public static int buyAndSell(int price[]){//Time Complixity --O(n)
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0;i<price.length;i++){
            if (buyPrice<price[i]){
                int profit=price[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);

            }else {
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={6,8,2,4,9,3,5,7,1,9};
        System.out.println( buyAndSell(price));

    }
}
