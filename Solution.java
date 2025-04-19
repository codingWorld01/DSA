class Solution {
    public int lengthOfLongestSubstring(String s) {
        int loc = 0, innerloc = 0, max = 0, length = 0;
        String substr;

        while (loc < s.length()) {

            substr = s.substring(loc, loc + innerloc + 1);

            System.out.println("substr " + substr);
            length = (length < innerloc + 1) ? innerloc + 1 : length;
            System.out.println("length " + length);
            if (max < length) { 
                max = length;
            }
            try {
                if (substr.contains(String.valueOf(s.charAt(loc + innerloc + 1)))) {
                    System.out.println("innerloc " + innerloc);
                    innerloc = 0;
                    loc++;
                    continue;
                }
            } catch (Exception ex) {
                innerloc = 0;
                break;
            }
            innerloc++;
            System.out.println("loc " + loc);
        }

        return max;
    }

    public static void main(String args[]) {

        String str = "bbbbb";
        int result = new Solution().lengthOfLongestSubstring(str);

        System.out.println("max " + result);
    }
}