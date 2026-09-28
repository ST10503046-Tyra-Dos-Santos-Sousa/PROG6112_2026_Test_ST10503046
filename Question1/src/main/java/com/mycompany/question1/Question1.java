package com.mycompany.question1;

public class Question1 {

    public static void main(String[] args) {

        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        int highestSales = 0;
        String cityWithMostSales = "";

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------");

        for (int i = 0; i < cities.length; i++) {

            int total = sales[i][0] + sales[i][1] + sales[i][2];

            System.out.println("City: " + cities[i]);
            System.out.println("PS5: " + sales[i][0]);
            System.out.println("XBOX: " + sales[i][1]);
            System.out.println("Nintendo Switch: " + sales[i][2]);
            System.out.println("Total Sales: " + total);

            // Check which city has the highest total sales
            if (total > highestSales) {
                highestSales = total;
                cityWithMostSales = cities[i];
            }

            System.out.println();
        }

        System.out.println("City with most sales: " + cityWithMostSales);
        System.out.println("Highest total sales: " + highestSales);
    }
}

