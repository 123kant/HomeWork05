package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(6, 5, 4);
        Box box3 = new Box(7, 8, 9);
        Box box4 = new Box(2, 1, 10);
        Box box5 = new Box(3, 4, 5);
        System.out.println("Box 1 " + box1 + " has volume " + box1.calculateVolume());
        System.out.println("Box 2 " + box2 + " has volume " + box2.calculateVolume());
        System.out.println("Box 3 " + box3 + " has volume " + box3.calculateVolume());
        System.out.println("Box 4 " + box4 + " has volume " + box4.calculateVolume());
        System.out.println("Box 5 " + box5 + " has volume " + box5.calculateVolume());

    }
}
