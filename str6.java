public class str6 {
    public static boolean checkShift(String s, String goal) {
        int l1=s.length();
        int l2=goal.length();
        if (l1 != l2) {
            return false;
        }
        String concat = s + s;
        return concat.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(checkShift(s, goal)); 
    }
}


