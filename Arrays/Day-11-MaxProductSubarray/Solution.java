class Solution {
    int maxProduct(int[] arr) {

        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        int fromLeftToRight = 1;
        int fromRightToLeft = 1;

        for (int i = 0; i < n; i++) {

            if (fromLeftToRight == 0)
                fromLeftToRight = 1;

            if (fromRightToLeft == 0)
                fromRightToLeft = 1;

            fromLeftToRight *= arr[i];

            int j = n - i - 1;
            fromRightToLeft *= arr[j];

            maxProduct = Math.max(fromLeftToRight,
                         Math.max(fromRightToLeft, maxProduct));
        }

        return maxProduct;
    }
}