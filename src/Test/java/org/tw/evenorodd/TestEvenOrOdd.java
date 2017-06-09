package org.tw.evenorodd;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestEvenOrOdd {
    @Test
    public void shouldCheckWhetherNumberIsOddOrEven() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals("odd", evenOrOdd.evenOrOdd(3));
    }
}
