package edu.petrov.lessons.classes;

import edu.petrov.lessons.CodeWars;

abstract class AbstractA {
    abstract void foo();
}

class A extends AbstractA {
    @Override
    void foo() {
        System.out.println("A.foo();");
    }
}


public class Main {

    public static void main(String[] args) {
        System.out.println(CodeWars.Sum.GetSum(1, 1) );
    }

    // foo
    private static void foo(AbstractA arg0) {
        arg0.foo();
    }

}
