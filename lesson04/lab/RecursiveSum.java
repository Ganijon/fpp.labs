package lesson4.lab;

/*
 * Using recursion sum up the numbers in array
 */
public class RecursiveSum {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5,}));
        System.out.println(sum(new int[]{10, 20, 30, 40}));
        System.out.println(sum(new int[]{-1, -2, -3, -4, -5,}));
    }

    public static int sum(int[] a) {
        if (a.length == 1) {
            return a[0];
        } else {

            int[] an = new int[a.length - 1];
            System.arraycopy(a, 1, an, 0, a.length - 1);
            return a[0] + sum(an);
        }
    }
}
