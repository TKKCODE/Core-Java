package com.Classes.Random;

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int a = r.nextInt(500000);
            if(a >= 100000){
                System.out.println(i + " " +a);
            }
        }
    }
}
