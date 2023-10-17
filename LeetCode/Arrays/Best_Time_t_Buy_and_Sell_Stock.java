package LeetCode.Arrays;

public class Best_Time_t_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

    static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minSoft = prices[0];
        for(int i = 0; i< prices.length; i++){
            minSoft = Math.min(minSoft,prices[i]);
            int profit = prices[i] - minSoft;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
