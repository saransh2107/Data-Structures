package arraysLC;

public class MaxProfitStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {2,4,1};
		System.out.println(maxProfit(prices));

	}
	public static int maxProfit(int[] prices) {
		int buy=prices[0];int buyday=0;
		int sell=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<buy) {
				buy=prices[i];
				buyday=i;
			}
		}
		for(int i=1;i<prices.length;i++) {
			if(prices[i]>sell && i>buyday) {
				sell=prices[i];
			}
		}
		if(sell<=0) {
			return 0;
		}
		return sell-buy;
		

	}

}
