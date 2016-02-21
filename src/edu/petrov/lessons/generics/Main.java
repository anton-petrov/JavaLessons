package edu.petrov.lessons.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;


public class Main {

    static class A {

        protected int value;

        public A() { value = 0; }

        public A(int value) { this.value = value; }

        public void printValue() {
            System.out.println("A, " + value);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

    }

    static class B extends A {

        public B() {}

        public B(int value) {
            this.value = value;
        }

        @Override
        public void printValue() {
            System.out.println("B, " + value);
        }

    }

    static class C extends B {

        public C(int value) {
            this.value = value;
        }

        @Override
        public void printValue() {
            System.out.println("C, " + value);
        }

    }

    public static void main(String[] args) {
        String[] words = { "Anton", "Petrov", "Vasya", "Petya", "123456" };
        Pair<String> mm = ArrayAlg.minmax(words);
        Object[] objects = new Object[1];

        Pair<String> p = Pair.create(String.class);

        System.out.println(mm.getFirst());
        System.out.println(mm.getSecond());
        System.out.println(ArrayAlg.getMiddle(words));

        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<Object> oList = new ArrayList<>();

        fill(aList); // covariance
        fill(oList); // contravariance

        print(aList);

        List<A> mList = makeList(bList);

        fill(mList);
    }

    /**
     * Covariance
     * @param list Любой класс, начиная с А и все его потомки
     */
    private static void print(List<? extends A> list) {
        Random r = new Random();
        for (A a : list) {
            a.setValue(r.nextInt(10));
            a.printValue();
        }
    }

    /**
     * Contravariance
     * @param list Любой класс, начиная с А и выше до Object
     */
    private static void fill(List<? super A> list) {
        Random r = new Random();
        list.add(new C(r.nextInt()));
        list.add(new B(r.nextInt()));
        list.add(new A(r.nextInt()));
    }

    private static List<A> makeList(List<? extends A> list) {
        List<A> result = new ArrayList<>();
        for (A a : list) {
            result.add(a);
        }
        return result;
    }
}
