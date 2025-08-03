public class BuyAndSellStock {
    public static int BuyAndSellStock(int prices[])
    {
        int buyprices=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprices<prices[i])
            {
                int profit=prices[i]-buyprices;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprices=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={23,78,89,90,45};
        System.out.println("The max profit is "+BuyAndSellStock(prices));
    }
} 
//TUF
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buyprices=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            int profit=prices[i]-buyprices;
            maxprofit=Math.max(maxprofit,profit);
            buyprices=Math.min(buyprices,prices[i]);
        }
        return maxprofit;
    }
}
        
    // }
    // public static void main(Strig[] args){
    //     int [] prices={7,1,5,3,6,4};
    // }
