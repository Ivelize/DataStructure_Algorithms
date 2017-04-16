
public class CoinsCombination {
	
	public int change(int amount, int[] coins, int index) {
		int amountWithCoins = 0;
		int remaindAmount = 0;
		int ways = 0;
		
		if(amount == 0){
			return 1;
		}
		if(index >= coins.length){
			return 0;
		}
		while(amountWithCoins <= amount){
			remaindAmount = amount - amountWithCoins;
			ways = ways + change(remaindAmount, coins, index+1);
			amountWithCoins = amountWithCoins + coins[index];
		}
		
        return ways;
    }
	
}
