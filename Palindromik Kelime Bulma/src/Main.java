public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome("abba"));
    }

    public static boolean isPalindrome(String str) {

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (reversed.equals(str)) {
            return true;
        }
        return false;
    }
}