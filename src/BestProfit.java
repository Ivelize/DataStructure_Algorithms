
public class BestProfit {
	
	public void becomeABillionaire(int arr[]) {
	    int i = 0, buy = 0, sell = 0, min = 0, profit = 0;

	    for (i = 0; i < arr.length; i++) {
	        if (arr[i] < arr[min])
	            min = i;
	        else if (arr[i] - arr[min] > profit) {
	            buy = min; 
	            sell = i;
	            profit = arr[i] - arr[min];
	        }

	    }

	    System.out.println("We will buy at : " + arr[buy] + " sell at " + arr[sell] + 
	            " and become billionaires worth " + profit );

	}

}
