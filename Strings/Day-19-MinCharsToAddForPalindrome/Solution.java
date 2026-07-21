class Solution {

    public int minChar(String s) {

        String reverse = new StringBuilder(s).reverse().toString();

        String combined = s + "$" + reverse;

        int[] lps = new int[combined.length()];

        constructLPS(combined, lps);

        return s.length() - lps[combined.length() - 1];
    }

    public static void constructLPS(String pat, int[] lps) {

        int len = 0;
        lps[0] = 0;

        int i = 1;

        while (i < pat.length()) {

            if (pat.charAt(i) == pat.charAt(len)) {

                len++;
                lps[i] = len;
                i++;

            } else {

                if (len != 0) {

                    len = lps[len - 1];

                } else {

                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}