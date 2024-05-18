/* Lab 7 */

/* 0/1 Knapsack problem */

public class knapSack01 {
    static int getMaxValue(ItemValue[] arr, int capacity) {
        int totalValue = 0;
        for (ItemValue i : arr) {
            int curWt = i.weight;
            int curVal = i.profit;
            if (capacity - curWt >= 0) {
                capacity -= curWt;
                totalValue += curVal;
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
        ItemValue[] item = { new ItemValue(300, 2), new ItemValue(190, 2), new ItemValue(180, 2) };
        int capacity = 4;
        int maxValue = getMaxValue(item, capacity);
        System.out.println(maxValue);
    }
}
