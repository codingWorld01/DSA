public class IsLongedPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int pointer1 = 0, pointer2 = 0;

        while (pointer2 < typed.length()) {
            if (pointer1 < name.length() && name.charAt(pointer1) == typed.charAt(pointer2)) {
                pointer1++;
                pointer2++;
            } else if (pointer2 > 0 && typed.charAt(pointer2) == typed.charAt(pointer2 - 1)) {
                pointer2++;
            } else {
                return false;
            }
        }

        return pointer1 == name.length();
    }
}
