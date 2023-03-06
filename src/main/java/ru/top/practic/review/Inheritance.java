package ru.top.practic.review;

public class Inheritance {

    static class Parent {

        {
            System.out.println("Parent init block"); // 3
        }

        static {
            System.out.println("Parent static block"); // 1
        }

        Parent() {
            System.out.println("Parent constructor"); // 4
        }
    }

    static class Child extends Parent {
        {
            System.out.println("Child init block"); // 5
        }

        static {
            System.out.println("Child static block"); // 2
        }

        Child() {
            System.out.println("Child constructor"); // 6
        }
    }

    public static void main(String[] args) {
        final Child child = new Child();
        System.out.println(child);
    }

}
