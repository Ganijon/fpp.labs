package lesson4.lab;

/*
 * Using recursion find the position of x in array a
 * return -1 if x not found
 */
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{0}, 0)); // 0

        System.out.println(binarySearch(new int[]{0}, 1)); // -1
        System.out.println(binarySearch(new int[]{0, 1}, 1)); // 1

        System.out.println(binarySearch(new int[]{0, 1, 2}, 2)); // 2
        System.out.println(binarySearch(new int[]{0, 1, 2, 3}, 2)); // 2
        System.out.println(binarySearch(new int[]{0, 1, 2, 3, 4}, 2)); // 2
        System.out.println(binarySearch(new int[]{0, 1, 2, 3, 4, 5}, 2)); // 2

        System.out.println(binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6}, 5)); // 5
        System.out.println(binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 7)); // 7
        System.out.println(binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 8)); // 8
        System.out.println(binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 9)); // -1
    }

    public static int binarySearch(int[] a, int x) {
        return binarySearch(a, x, 0, a.length - 1);
    }

    private static int binarySearch(int[] a, int x, int first, int last) {
        
        if (first > last)
            return -1;

        int mid = (first + last) / 2;

        if (a[mid] == x)
            return mid;
        else 
            if (a[mid] < x)
                return binarySearch(a, x, mid + 1, last);
            else
                return binarySearch(a, x, first, mid - 1);
    }
}
