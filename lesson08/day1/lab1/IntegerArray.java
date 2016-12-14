package lesson8.day1.lab1;

import java.lang.Math;

public class IntegerArray {

    public static void main(String[] args) {
        System.out.println("\n[Create IntegerArray object with capacity 10]");

        IntegerArray arr = new IntegerArray(10);
        System.out.println(arr);
        System.out.println("Size = " + arr.getSize());

        System.out.println("\n[Insert 50 random numbers in the range of 0 -100]");

        for (int i = 0; i < 50; i++) {
            arr.add((int)(100 * Math.random()));
        }
        System.out.println(arr);
        System.out.println("Size = " + arr.getSize());

        System.out.println("\n[Get the value by passing index]");
        System.out.println(arr.get(1));
        System.out.println(arr.get(49));
        System.out.println(arr.get(50)); // -1
        System.out.println(arr.get(51)); // -1

        System.out.println("\n[Remove duplicate from the array]");
        arr.removeDuplicates();
        System.out.println(arr);

        System.out.println("\n[Find the size of the array]");
        System.out.println("Size = " + arr.getSize());

        System.out.println("\n[Get the sublist by passing start and end index]"); // .
        int[] sub = arr.sublist(-5, 5);
        System.out.print("Sub Items = [ ");
        for (int i : sub)
            System.out.print(i + " ");
        System.out.print("]\n");
        System.out.println("Sub Size = " + sub.length);

        System.out.println("\n[Remove all elements from the array]");
        arr.removeAll();
        System.out.println(arr);
        System.out.println("Size = " + arr.getSize());
    }

    private static final int DEFAULT_CAPACITY = 10;
    private int[]            array;
    private int              size;

    public IntegerArray() {
        this(DEFAULT_CAPACITY);
    }

    public IntegerArray(int capacity) {
        capacity = (capacity >= 0) ? capacity : DEFAULT_CAPACITY;
        array = new int[capacity];
        size = 0;
    }

    public void add(int item) {
        if (size == array.length)
            resize();

        array[size] = item;
        size++;
    }

    public int get(int index) {
        if (index >= size)
            return -1;

        return array[index];
    }

    public int[] removeDuplicates() {
        int[] tmp = new int[size];
        int tmpSize = 0;

        boolean isDuplicate;
        for (int a : array) {
            isDuplicate = false;
            for (int i = 0; i < size; i++) {
                if (tmp[i] == a) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tmp[tmpSize] = a;
                tmpSize++;
            }
        }
        return tmp;
    }

    public void removeAll() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int[] sublist(int startIndex, int endIndex) {
        if (startIndex < 0)
            startIndex = 0;
        if (endIndex > size - 1)
            endIndex = size - 1;

        int[] sub = new int[1 + endIndex - startIndex];

        for (int i = startIndex; i <= endIndex; i++)
            sub[i] = array[i];

        return sub;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    private void resize() {
        System.out.println("Resizing ...");
        int[] tmp = new int[2 * array.length];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }
}