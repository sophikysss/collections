package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListPerformanceTest {
    @Test
    public void testLinkedListPerformance() {
        int count=2000;
        LinkedListPerformance.TestLinkedList(count);
        assertTrue(LinkedListPerformance.TimeAdd>0);
        assertTrue(LinkedListPerformance.TimeDelete>0);
        assertTrue(LinkedListPerformance.TimeGet>0);
    }

}