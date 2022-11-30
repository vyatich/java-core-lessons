package ru.top.practic.oop.generics;

//        Реализовать методы:
//        ■ pushBack (добавление элемента в конец массива. Должна
//        быть проверка, достаточно ли памяти! Если памяти не
//        достаточно увеличить емкость массива данных);
//        ■ popFront (удаление первого элемента из массива);
public class MyArrayList<T> {

    private T[] data;
    private int size;
    private int capacity = 10;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.data = (T[]) new Object[capacity];
    }

    public MyArrayList() {
        this.data = (T[]) new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    private void ensureCapacity(int count) {
        while (count > capacity) {
            capacity = (int) (capacity * 1.5 + 1);
            Object[] tempArray = new Object[capacity];
            System.arraycopy(data, 0, tempArray, 0, size);
            data = (T[]) tempArray;
        }
    }

    public void pushBack(T element) {
        ensureCapacity(size + 1);
        data[size] = element;
        size++;
    }

    public void popFront() {
        Object[] tempArray = new Object[capacity];
        System.arraycopy(data, 1, tempArray, 0, size - 1);
        data = (T[]) tempArray;
        size--;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (T element : data) {
            sb.append(element);
            sb.append("\s");
        }
        return sb.toString();
    }
}
