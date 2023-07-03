public class str3 {
    public static  String addStr(String num1, String num2) {
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (l1 >= 0 || l2 >= 0 || carry > 0) {
            int digitNum1 = (l1 >= 0) ? num1.charAt(l1) - '0' : 0;
            int digitNum2 = (l2 >= 0) ? num2.charAt(l2) - '0' : 0;
            int digitSum = digitNum1 + digitNum2 + carry;

            carry = digitSum / 10;
            int digit = digitSum % 10;
            result.insert(0, digit);

            l1--;
            l2--;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStr(num1, num2));  // Output: "134"
    }
}


