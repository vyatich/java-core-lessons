package ru.top.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample {

    public static void main(String[] args) {
        Integer[] array = {9, 2, 8};//10- 1 = 9 - last element

        Integer[] copyArray = new Integer[3];
        System.out.println(Arrays.toString(copyArray));

        System.arraycopy(array, 0, copyArray, 0, 3);
        System.out.println(Arrays.toString(copyArray));

        Arrays.sort(copyArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(copyArray));
        System.out.println(Arrays.binarySearch(copyArray, 2));


    }
}
