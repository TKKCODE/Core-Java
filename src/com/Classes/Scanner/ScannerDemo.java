package com.Classes.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("Scratch-Files/Test.txt");
        f.createNewFile();
        Scanner scan = new Scanner(f);
        while(scan.hasNext()){
            char c = (char) scan.nextByte();
            System.out.println(c);
        }
    }
}
