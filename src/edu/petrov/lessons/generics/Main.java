package edu.petrov.lessons.generics;

import java.util.*;


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

        public C() {}

        public C(int value) {
            this.value = value;
        }

        @Override
        public void printValue() {
            System.out.println("C, " + value);
        }

    }

    static class D extends C {

        public D() {}

        public D(int value) {
            this.value = value;
        }

        @Override
        public void printValue() {
            System.out.println("D, " + value);
        }

    }

    public static void main(String[] args) {
//        String[] words = { "Anton", "Petrov", "Vasya", "Petya", "123456" };
//        Pair<String> mm = ArrayAlg.minmax(words);
//        Object[] objects = new Object[1];
//
//        Pair<String> p = Pair.create(String.class);
//
//        System.out.println(mm.getFirst());
//        System.out.println(mm.getSecond());
//        System.out.println(ArrayAlg.getMiddle(words));
//
//        List<A> aList = new ArrayList<>();
//        List<B> bList = new ArrayList<>();
//        List<C> cList = new ArrayList<>();
//        List<D> dList = new ArrayList<>();
//
//        List<Object> oList = new ArrayList<>();
//
//        // contravariant
//        List<? super D> ddList = aList;
//
//        // covariant
//        List<? extends A> aaList = dList;
//        A a = aaList.get(0);
//
//        fill(aList); // covariance
////        fill(bList); // error
//        fill(oList); // contravariance
//
//        print(bList);
//
//        List<A> mList = makeList(bList);
//
//        fill(mList);

        foo();
    }

    // foo
    private static void foo() {
        List<Object> objs = Arrays.asList(2, 3.14, "four");
        List<Integer> ints = Arrays.asList(5, 6);
        Collections.copy(objs, ints);
        assert objs.toString().equals("[5, 6, four]");

//        List<Integer> ints = Arrays.asList(1,2,3);
//        List<? extends Number> nums = ints;
//        double dbl = sum(nums); // ok
//        nums.add(3.14); // compile-time error
//        List<Object> objs = Arrays.<Object>asList(1,"two");
//        List<? super Integer> ints = objs;
//        ints.add(3); // ok
//        double dbl = sum(ints); // compile-time error
    }

    /**
     * Covariant
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
     * Contravariant
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
