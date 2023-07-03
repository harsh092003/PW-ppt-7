public class str2 {
    public static boolean checkStrobo(String num) {
        int first = 0;
        int last = num.length() - 1;

        while (first <= last) {
            char charLeft = num.charAt(first);
            char charRight = num.charAt(last);

            if (!isStroboPair(charLeft, charRight)) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }

    private static boolean isStroboPair(char c1, char c2) {
        return (c1 == '0' && c2 == '0') ||
               (c1 == '1' && c2 == '1') ||
               (c1 == '8' && c2 == '8') ||
               (c1 == '6' && c2 == '9') ||
               (c1 == '9' && c2 == '6');
    }

    public static void main(String[] args) {
        String num = "69";
        System.out.println(checkStrobo(num));  // Output: true
    }
}


