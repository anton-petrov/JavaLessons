package edu.petrov.lessons.generics;

public class Main {

    public static void main(String[] args) {
        String[] words = { "Anton", "Petrov", "Vasya", "Petya", "123456" };
        Pair<String> mm = ArrayAlg.minmax(words);
        Object[] objects = new Object[1];

        Pair<String> p = Pair.create(String.class);

        System.out.println(mm.getFirst());
        System.out.println(mm.getSecond());
        System.out.println(ArrayAlg.<String>getMiddle(words));
    }
}
