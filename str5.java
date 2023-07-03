public class str5 {
    public static String reverse2Str(String s, int k) {
        char ch[] = s.toCharArray();
        int l=ch.length;
        for (int i = 0; i <l; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, ch.length - 1);
            reverseStr(ch, start, end);
        }
        return new String(ch);
    }

    private static void reverseStr(char[] ch, int start, int end) {
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverse2Str(s, k));  
    }
}
 

