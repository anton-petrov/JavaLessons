package edu.petrov.lessons.generics;

public class ArrayAlg {

    private static <T> boolean isArrayExist(T[] a) {
        if (a == null || a.length == 0)
            return false;
        else
            return true;
    }

    public static <T extends Comparable> T min(T[] a) {
        if (!isArrayExist(a))
            return null;

        T smallest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0)
                smallest = a[i];
        }

        return smallest;
    }

    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (!isArrayExist(a))
            return null;

        T min = a[0];
        T max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }

        return new Pair<T>(min, max);
    }

    public static <T> T getMiddle(T[] a) {
        T result;
        if (!isArrayExist(a))
            result = null;
        else
            result = a[a.length / 2];

        return result;
    }
}