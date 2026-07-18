import java.util.Arrays;

class Solution {

    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        char[] s1CharArray = s1.toCharArray();
        char[] s2CharArray = s2.toCharArray();

        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);

        return Arrays.equals(s1CharArray, s2CharArray);
    }
}