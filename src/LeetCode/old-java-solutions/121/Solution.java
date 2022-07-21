class Solution {
		public static void main(String args[]){
			int[] prices = new int[] {7,1,5,3,6,4};
			System.out.println(maxProfit(prices));

			prices = new int[] {2,4,1};
			System.out.println(maxProfit(prices));
		}
    public static int maxProfit(int[] prices) {
			int len = prices.length;
			if(len < 2) return 0;
			int cheapest = prices[0];
			int profit = 0;
			for(int i=0; i<len; i++){
				cheapest = Math.min(cheapest, prices[i]);
				int tmpProfit = prices[i] - cheapest;
				profit = Math.max(tmpProfit, profit);

			}
		return profit;
		}

}
