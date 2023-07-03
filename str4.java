public class str4 {
    public static String reverse(String s) {
        String words[] = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWrd(words[i]);
        }

        return String.join(" ", words);
    }

    private static String reverseWrd(String word) {
        char ch[] = word.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverse(s));  
    }
}


