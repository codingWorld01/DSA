public class ReverseString {
    public void reverseString(char[] s) {
        int second = s.length- 1;
        

        for(int i = 0; i < (s.length / 2); i++) {
            char temp = s[second];
            s[second] = s[i];
            s[i] = temp;


            second--;
        }

    }
}
