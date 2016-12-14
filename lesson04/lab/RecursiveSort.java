package lesson4.lab;

/*
 * Using recursion sort string characters 
 */
public class RecursiveSort {

    public static void main(String[] args) {
        System.out.println(sort("abstraction"));
        System.out.println(sort("composition"));
        System.out.println(sort("aggregation"));
        System.out.println(sort("polymorphism"));
        System.out.println(sort("inheritance"));
        System.out.println(sort("encapsulation"));
    }

    public static String sort(String s) {
    
        if (s == null || s.length() < 2)
            return s;

        int pos = 0;
        char min = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < min) {
                min = c;
                pos = i;
            }
        }

        System.out.printf("%c | %s\n", min, s.substring(0, pos) + s.substring(pos + 1));
        return min + sort(s.substring(0, pos) + s.substring(pos + 1));
    }
}
