/* Lab 7 - Dynamic Programming */

/* 0/1 Knapsack problem */

public class knapSack01 {
    static int getMaxValue(int[] weight, int[] value, int capacity, int n) {
        if (n == 0 || capacity == 0)
            return 0;
        if (weight[n - 1] > capacity)
            return getMaxValue(weight, value, capacity, n - 1);
        else
            return max(value[n - 1] + getMaxValue(weight, value, capacity - weight[n - 1], n - 1), getMaxValue(weight, value, capacity, n - 1));
    }

    static int max(int x, int y) {
        return x > y ? x : y;
    }
    
    public static void main(String[] args) {
        int capacity = 4;
        int[] weight = { 2, 2, 2 };
        int[] value = { 300, 190, 180};
        int maxValue = getMaxValue(weight, value, capacity, weight.length);
        System.out.println(maxValue);
    }
}
