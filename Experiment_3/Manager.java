package Experiment_3;

import java.util.Scanner;

class Manager extends Employee {
    String department;

    void getManagerData(Scanner sc) {
        getEmployeeData(sc);
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayManagerData() {
        System.out.println("\n===== MANAGER DETAILS =====");
        displayEmployeeData();
        System.out.println("Department:\t" + department);
    }
}