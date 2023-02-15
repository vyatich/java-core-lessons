package ru.top.method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

class RecursiveTest {

    private Recursive recursive;

    @Test
    void getFactorialByFile() {
        DigitFileReader digitFileReader = Mockito.mock(DigitFileReader.class);
        recursive = new Recursive(digitFileReader);
        Mockito.when(digitFileReader.getDigits()).thenReturn(List.of(5, 5, 10));

        List<Integer> factorialByFile = recursive.getFactorialByFile();

        Assertions.assertEquals(3, factorialByFile.size());
        Assertions.assertEquals(List.of(120, 120, 3628800), factorialByFile);
        Mockito.verify(digitFileReader, Mockito.atLeastOnce()).getDigits();
    }
}