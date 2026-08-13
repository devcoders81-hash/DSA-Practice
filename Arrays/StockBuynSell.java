package Arrays;

public class StockBuynSell {
    public int maxProfit(int[] prices) {
        int buying_price=prices[0];//7
        int profit=0;
        for(int i=1;i<prices.length;i++){//1,5,3,6,4
            if(prices[i]<buying_price){
                buying_price=prices[i];
            }
            
                profit=Math.max(profit,prices[i]-buying_price);
            
        }
        return profit;
    }
    public static void main(String[] args) {
        StockBuynSell s=new StockBuynSell();
        int[] prices={7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));
    }
}
