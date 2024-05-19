/* Lab 7 */

/* 0/1 Knapsack problem */

public class knapSack01 {
    static int getMaxValue(int[] weight, int[] value, int capacity) {
        int totalValue = 0;
        for (int i = 0; i < weight.length; i++) {
            int curWt = weight[i];
            int curVal = value[i];
            if (capacity - curWt >= 0) {
                capacity -= curWt;
                totalValue += curVal;
            }
        }
        return totalValue;
    }
    
    public static void main(String[] args) {
        int capacity = 4;
        int[] weight = { 2, 2, 2 };
        int[] value = { 300, 190, 180};
        int maxValue = getMaxValue(weight, value, capacity);
        System.out.println(maxValue);
    }
}
