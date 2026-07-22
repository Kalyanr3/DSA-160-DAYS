class Solution {

    public boolean areRotations(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        String txt = s1 + s1;
        String pat = s2;

        int[] lps = computeLPSArray(pat);

        int i = 0;
        int j = 0;

        while (i < txt.length()) {

            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == pat.length()) {
                return true;
            }

            else if (i < txt.length() && pat.charAt(j) != txt.charAt(i)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        return false;
    }

    static int[] computeLPSArray(String pat) {

        int[] lps = new int[pat.length()];

        int len = 0;
        int i = 1;

        while (i < pat.length()) {

            if (pat.charAt(i) == pat.charAt(len)) {

                len++;
                lps[i] = len;
                i++;

            } else {

                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}