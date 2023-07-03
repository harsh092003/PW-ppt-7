public class str7 {
    public static boolean compare(String s, String t) {
        String S = build(s);
        String T = build(t);
        return S.equals(T);
    }

    private static String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(compare(s, t));  
    }
}


