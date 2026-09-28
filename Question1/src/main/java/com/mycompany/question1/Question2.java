package com.mycompany.question1;

import java.util.Scanner;

interface IConsole {

    String getConsoleType();
    String getStore();
    int getTotalSales();
}

abstract class Console implements IConsole {

    String consoleType;
    String store;
    int totalSales;

    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return store;
    }

    public int getTotalSales() {
        return totalSales;
    }
}

class ConsoleDevice extends Console {

    public ConsoleDevice(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }
}

public class Question2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the store name: ");
        String store = input.nextLine();

        System.out.print("Enter the console type: ");
        String consoleType = input.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = input.nextInt();

        ConsoleDevice console = new ConsoleDevice(consoleType, store, totalSales);

        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("--------------------");
        System.out.println("Store: " + console.getStore());
        System.out.println("Console Type: " + console.getConsoleType());
        System.out.println("Total Sales: " + console.getTotalSales());

        input.close();
    }
}
