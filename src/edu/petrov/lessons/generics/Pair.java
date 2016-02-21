package edu.petrov.lessons.generics;

/**
 * Created by anton on 21/02/16.
 */
public class Pair<T> {
    private T first;
    private T second;

    public static <T> Pair<T> create(Class<T> c) {
        try {
            return new Pair<T>(c.newInstance(), c.newInstance());
        }
        catch (Exception e) {
            return null;
        }
    }

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
