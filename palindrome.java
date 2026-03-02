public class palindrome {

    public static void main(String args[]) {

        String s1 = "nitin";
        boolean flag = true;

        for (int i = 0; i < s1.length() / 2; i++) {

            char c = s1.charAt(i);
            char d = s1.charAt(s1.length() - 1 - i);

            if (c != d) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}