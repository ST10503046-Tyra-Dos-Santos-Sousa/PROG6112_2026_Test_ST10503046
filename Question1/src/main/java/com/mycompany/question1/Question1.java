package com.mycompany.question1;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        int[][] sales = {{1000, 2000, 3000},
        {2000, 3000, 4000},
        {1500, 1100, 1200}
        };

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------");

        for (int i = 0; i < cities.length; i++) {

            System.out.println("City: " + cities[i]);
            System.out.println("PS5: " + sales[i][0]);
            System.out.println("XBOX: " + sales[i][1]);
            System.out.println("Nintendo Switch: " + sales[i][2]);

            System.out.println();
        }
    }
}
