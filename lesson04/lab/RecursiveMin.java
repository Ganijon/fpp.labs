package lesson4.lab;

/*
 * Using recursion find the minimum character in a given string input 
 */
public class RecursiveMin {
    public static void main(String[] args) {
        System.out.printf("%c\n", min("abstraction"));
        System.out.printf("%c\n", min("composition"));
        System.out.printf("%c\n", min("aggregation"));
        System.out.printf("%c\n", min("polymorphism"));
        System.out.printf("%c\n", min("inheritance"));
        System.out.printf("%c\n", min("encapsulation"));
        System.out.printf("%c\n", min(null));
    }

    public static char min(String s) {

        if (s == null)
            return 0;

        if (s.length() == 1)
            return s.charAt(0);

        char c = s.charAt(0);

        char cn = min(s.substring(1));

        return (c < cn) ? c : cn;
    }
}
