class Solution {
    int maxSubarraySum(int[] arr) {

        int result = arr[0];
        int currSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currSum = Math.max(currSum + arr[i], arr[i]);
            result = Math.max(result, currSum);
        }

        return result;
    }
}