
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, maxlen = 0, len;
        char current;
        int arr[] = new int[256];

        for (int i = 0; i < 256; i++) {
            arr[i] = -1;
        }

        while (end < s.length()) {
            current = s.charAt(end);
            if (arr[current] >= start) {
                start = arr[current] + 1;
            }
            
            arr[current] = end;
            len = end - start + 1;
            maxlen = Math.max(len, maxlen);
            end++;
        }

        return maxlen;

    }

    public static void main(String args[]) {
        String str = "pwwkew";
        int result = new Solution().lengthOfLongestSubstring(str);

        System.out.println("max " + result);
    }
}
