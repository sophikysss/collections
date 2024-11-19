package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListPerformanceTest {
    @Test
    public void testArrayListPerformance() {
        int count=2000;
        ArrayListPerformance.TestArrayList(count);
        assertTrue(ArrayListPerformance.TimeAdd>0);
        assertTrue(ArrayListPerformance.TimeDelete>0);
        assertTrue(ArrayListPerformance.TimeGet>0);
    }

}
