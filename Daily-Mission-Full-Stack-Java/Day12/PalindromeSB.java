public class PalindromeSB {
    public static void main(String[] args) {
        String str = "racecar";
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
