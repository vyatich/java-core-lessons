package ru.top.practic.oop.interfaces.practice1;

import ru.top.practic.oop.interfaces.practice2.IMath;
import ru.top.practic.oop.interfaces.practice3.ISort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Array implements IShow, IMath, ISort {

    private final Integer[] array;

    public Array(Integer[] array) {
        this.array = array;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void print(String info) {
        System.out.println(Arrays.toString(array) + info);
    }

    public Integer[] getArray() {
        return array;
    }

    @Override
    public int max() {
        Integer[] tempArray = array;
        Arrays.sort(tempArray, Collections.reverseOrder());
        return tempArray[0];
    }

    @Override
    public int min() {
        Integer[] tempArray = array;
        Arrays.sort(tempArray);
        return tempArray[0];
    }

    @Override
    public float avg() {
        float sum = 0;
        for (Integer integer : array) {
            sum += integer;
        }
        return sum / array.length;
    }

    @Override
    public void sortAsc() {
        Arrays.sort(array);
    }

    @Override
    public void sortDesc() {
        Arrays.sort(array, Collections.reverseOrder());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
