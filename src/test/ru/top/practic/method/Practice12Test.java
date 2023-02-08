package ru.top.practic.method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class Practice12Test {

    @Test
    void getFactorial() {
        int actual = Practice12.getFactorial(5);

        Assertions.assertEquals(120, actual, "Итог не сошелся");
    }

    @Test
    void getFactorial_WhenByZero_ShouldThrowRuntimeException() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> Practice12.getFactorial(0));

        Assertions.assertEquals("Факториал 0 не существует", runtimeException.getMessage());
    }

    @Test
    void getFactorial_WhenByNegativeNumber_ShouldThrowRuntimeException() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> Practice12.getFactorial(-5));

        Assertions.assertEquals("Факториал -5 не существует", runtimeException.getMessage());
    }
}