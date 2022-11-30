package ru.top.oop.generics;

public class Array<T> {

    private final T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }
}
