public class Solution {
	public int maximumWealth(int[][] accounts) {
		int maxSum = 0;
		for (int[] customerAcs : accounts) {
			maxSum = Math.max(maxSum, customerSum(customerAcs));
		}
		return maxSum;
	}
	
	private int customerSum(int[] customerAccounts) {
		int total = 0;
		for(int sum : customerAccounts) {
			total+=sum;
		}
		return total;
	}
}
