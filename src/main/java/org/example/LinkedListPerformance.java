package org.example;

import java.util.LinkedList;
import java.util.List;
public class LinkedListPerformance {
    public static long TimeAdd;
    public static long TimeDelete;
    public static long TimeGet;

    public static void TestLinkedList(int count)
    {
        List<Integer> linkedList = new LinkedList<>();

        // Add metod
        long TimeStart = System.nanoTime();
        for (int i=0; i<count; i++)
        {
            linkedList.add(i);
        }
        long TimeEnd=System.nanoTime();
        TimeAdd=TimeEnd-TimeStart;

        // Delete metod
        TimeStart = System.nanoTime();
        for (int i=count-1; i>=0; i--) {
            linkedList.remove(i);
        }
        TimeEnd=System.nanoTime();
        TimeDelete=TimeEnd-TimeStart;

        //Get metod
        for (int j=0; j<count; j++)
        {
            linkedList.add(j);
        }
        TimeStart = System.nanoTime();
        for (int i=0; i<count; i++)
        {
            if (!linkedList.isEmpty())
            {
                int element = linkedList.get(i);
            } else {
                System.out.println("LinkedList is empty.");
            }
        }
        TimeEnd=System.nanoTime();
        TimeGet=TimeEnd-TimeStart;

        System.out.println("\033[1;4m" + "LinkedList Performance Results:" + "\033[0m");
        System.out.format("%-10s %-15s %-15s%n", "Method", "Counts", "Time in ns");
        System.out.format("%-10s %-15d %-15d%n", "add", count, TimeAdd);
        System.out.format("%-10s %-15d %-15d%n", "delete", count, TimeDelete);
        System.out.format("%-10s %-15d %-15d%n", "get", count, TimeGet);
    }
}