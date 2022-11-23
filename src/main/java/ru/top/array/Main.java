package ru.top.array;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[15];
        Integer[] arrayCopy = new Integer[15];

        Arrays.fill(array, 2);
        array[5] = 100;

        Arrays.sort(array, Collections.reverseOrder());
        System.arraycopy(array, 0, arrayCopy, 0, array.length);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayCopy));

        System.out.println(array.equals(arrayCopy));
        System.out.println(Arrays.equals(array, arrayCopy));
    }
}
