import java.util.*;

class Solution {
    public int missingNumber(int[] arr) {

        int res = 1;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == res)
                res++;
            else if (arr[i] > res)
                break;
        }

        return res;
    }
}