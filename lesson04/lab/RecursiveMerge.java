package lesson4.lab;

/*
 * Using recursion merge the two sorted string into a single sorted string.
 * Example : 
 *      String1 = “ ace ”
 *      String2 = “ bdf ”
 * Output : “ abcdef ”
 */
public class RecursiveMerge {

    public static void main(String[] args) {
        System.out.println(merge("foot", "ball"));
        System.out.println(merge("snow", "flake"));
        System.out.println(merge("pen", "drive"));
        System.out.println(merge("1st string", "2nd string"));
    }

    public static String merge(String s, String s2) {
        
        s = s + s2;

        if (s.length() < 1)
            return s;

        int pos = 0;
        char min = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (min > c) {
                min = c;
                pos = i;
            }
        }

        System.out.printf("%c: %s\n", min, s.substring(0, pos) + s.substring(pos + 1));

        return min + merge(s.substring(0, pos) + s.substring(pos + 1), "");
    }
}
