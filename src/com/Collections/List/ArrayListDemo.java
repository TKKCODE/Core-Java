package com.Collections.List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 1200; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                al.add(i);
            }
        }

        System.out.println(al);
    }
}
