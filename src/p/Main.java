/*
*-Creator: Rafae Khan
*-Language Used: Java
*-Program Name: Payroll system
*-Program Description: This program is a basic payroll system utilizing several design principles
 */
package p;

import java.util.Scanner;


public class Main {

    static Scanner scan = new Scanner(System.in);

    String choice = "";

    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println("*             PAYROLL SYSTEM               *");
        System.out.println("********************************************");
        printMenu();

    }

    public static void printMenu() {
        System.out.println("1. Register Employee.");
        System.out.println("2. View Employee.");
        System.out.println("3. Remove Employee.");
        System.out.println("4. Generate Pay Slip.");
        System.out.println("5. Exit.");
        System.out.println("Enter action to do.");
        printSubMenu(scan.nextLine());
    }

    public static void printSubMenu(String choice) {
        switch (choice) {
            case "1":
                System.out.println("Select Employee Type.\n1. Salaried.\n2. Hourly.\n3. Commissioned.");
                registerEmployee(scan.nextLine());
            default:
                System.out.println("Invalid Action!!!");
                printMenu();
        }
    }

    private static void registerEmployee(String type) {
        switch (type) {
            case "1":
                SalariedEmployee semp = new SalariedEmployee();
            case "2":
                HourlyEmployee hemp = new HourlyEmployee();
            case "3":
                CommisionedEmployee cemp = new CommisionedEmployee();
            default:
                System.out.println("Invalid Action!!!");
                printSubMenu("1");
        }
    }

}
