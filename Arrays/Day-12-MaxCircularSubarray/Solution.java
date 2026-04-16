class Solution {
    public int maxCircularSum(int arr[]) {

        int maxSum = arr[0], minSum = arr[0];
        int totalSum = 0, currMaxSum = 0, currMinSum = 0;

        for (int i = 0; i < arr.length; i++) {

            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(currMaxSum, maxSum);

            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            minSum = Math.min(currMinSum, minSum);

            totalSum += arr[i];
        }

        int normalSum = maxSum;
        int circularSum = totalSum - minSum;

        if (totalSum == minSum)
            return normalSum;

        return Math.max(normalSum, circularSum);
    }
}