package org.example;

import java.util.ArrayList;
import java.util.List;
public class ArrayListPerformance {
    public static long TimeAdd;
    public static long TimeDelete;
    public static long TimeGet;

    public static void TestArrayList(int count)
    {
        List<Integer> arrayList = new ArrayList<>();

        // Add metod
        long TimeStart = System.nanoTime();
        for (int i=0; i<count; i++)
        {
            arrayList.add(i);
        }
        long TimeEnd=System.nanoTime();
        TimeAdd=TimeEnd-TimeStart;

        // Delete metod
        TimeStart = System.nanoTime();
        for (int i=count-1; i>0; i--)
        {
            arrayList.remove(i);
        }
        TimeEnd=System.nanoTime();
        TimeDelete=TimeEnd-TimeStart;

        //Get metod
        for (int j=0; j<count; j++)
        {
            arrayList.add(j);
        }
        TimeStart = System.nanoTime();

        for (int i=0; i<count; i++)
        {
            if (!arrayList.isEmpty())
            {
                int element = arrayList.get(i);
            }
            else {
                System.out.println("ArrayList is empty.");
            }
        }
        TimeEnd=System.nanoTime();
        TimeGet=TimeEnd-TimeStart;

        System.out.println("\033[1;4m" + "ArrayList Performance Results:" + "\033[0m");
        System.out.format("%-10s %-15s %-15s%n", "Method", "Counts", "Time in ns");
        System.out.format("%-10s %-15d %-15d%n", "add", count, TimeAdd);
        System.out.format("%-10s %-15d %-15d%n", "delete", count, TimeDelete);
        System.out.format("%-10s %-15d %-15d%n", "get", count, TimeGet);

    }
}