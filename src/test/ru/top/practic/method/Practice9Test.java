package ru.top.practic.method;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class Practice9Test {

    static Integer[] numbers;

    @BeforeAll
    public static void init() {
        numbers = new Integer[]{0, -5, 9, 6, 10};
    }

    @Test()
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void sort_WhenArgumentTrue_ShouldSortAsc() {
        Practice9.sort(numbers, true);

        Integer[] expected = {-5, 0, 6, 9, 10};
        Assertions.assertArrayEquals(numbers, expected);
    }

    @Test
    void sort_WhenArgumentFalse_ShouldSortDesc() {
        Practice9.sort(numbers, false);

        Integer[] expected = {10, 9, 6, 0, -5};
        Assertions.assertArrayEquals(numbers, expected);
    }
}