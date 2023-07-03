public class str1 {
    public static boolean check(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        if (l1 != l2) {
            return false;
        }

        int s_t[] = new int[256];
        int t_s[] = new int[256];

        for (int i = 0; i < l1; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (s_t[charS] == 0 && t_s[charT] == 0) {
                s_t[charS] = charT;
                t_s[charT] = charS;
            } else if (s_t[charS] != charT || t_s[charT] != charS) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(check(s, t));  // Output: true
    }
}

