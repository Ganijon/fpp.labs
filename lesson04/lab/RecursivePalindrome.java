package lesson4.lab;

/*
 * Using recursion identify palindrome string
 */
public class RecursivePalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("Madam, I'm Adam"));
        System.out.println(isPalindrome("Poor Dan is in a droop"));
        System.out.println(isPalindrome("Not a palindrome string!"));
    }

    public static boolean isPalindrome(String s) {

        if (s == null)
            return false;

        if (s.length() == 1)
            return true;

        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        char head = s.charAt(0);
        char tail = s.charAt(s.length() - 1);
        System.out.printf("%c %s %c  in  %s \n", head, (head == tail) ? "=" : "!=", tail, s);
        
        return (head == tail) && isPalindrome(s.substring(1, s.length() - 1));
    }
}
