/* Lab 6 */

/* Fractional Knapsack */

public class fractionalKnapsack {
	private static double getMaxValue(ItemValue[] arr, int capacity) {
		double totalValue = 0;
		for (ItemValue i : arr) {
			int curWt = (int)i.weight;
			int curVal = (int)i.profit;
			if (capacity - curWt >= 0) {
				capacity = capacity - curWt;
				totalValue += curVal;
			} else {
				double fraction = ((double)capacity / (double)curWt);
				totalValue += (curVal * fraction);
				capacity = (int)(capacity - (curWt * fraction));
				break;
			}
		}
		return totalValue;
	}
	static class ItemValue {
		int profit, weight;
		public ItemValue(int val, int wt) {
			this.weight = wt;
			this.profit = val;
		}
	}
	public static void main(String[] args) {
		ItemValue[] items = { new ItemValue(300, 3), new ItemValue(190, 2),new ItemValue(180, 2) };
		int capacity = 4;
		double maxValue = getMaxValue(items, capacity);
		System.out.println(maxValue);
	}
}
