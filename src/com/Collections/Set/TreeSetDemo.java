package com.Collections.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(12);
        ts.add(15);
        ts.add(5);
        ts.add(17);
        ts.add(11);

        System.out.println(ts);
    }
}
