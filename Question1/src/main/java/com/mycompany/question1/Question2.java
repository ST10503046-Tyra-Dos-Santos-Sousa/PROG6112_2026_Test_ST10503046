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
@Override
    public String getConsoleType() {
        return consoleType;
    }
@Override
    public String getStore() {
        return store;
    }
@Override
    public int getTotalSales() {
        return totalSales;
    }
}

class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    public void printReport() {
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store: " + getStore());
        System.out.println("Total Sales: " + getTotalSales());
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

       ConsoleSales console = new ConsoleSales(consoleType, store, totalSales);

System.out.println();
System.out.println("CONSOLE SALES REPORT");
System.out.println("--------------------");

console.printReport();

input.close();
