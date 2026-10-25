package Experiment_3;

import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Employee extends Person {
    int empId;
    double salary;

    void getEmployeeData(Scanner sc) {
        getPersonData(sc);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        System.out.print("Enter Salary: ");
        try {
            double sal = sc.nextDouble();
            if (sal < 0) {
                throw new InvalidSalaryException("Salary cannot be negative!");
            }
            salary = sal;
        } catch (InvalidSalaryException e) {
            System.out.println("[Exception Caught]: " + e.getMessage());
            System.out.println("Defaulting salary to 0.0");
            salary = 0.0;
        } catch (InputMismatchException e) {
            System.out.println("[Exception Caught]: Invalid input format for salary!");
            System.out.println("Defaulting salary to 0.0");
            salary = 0.0;
            sc.next();
        }
        sc.nextLine(); // Consume newline
    }

    void displayEmployeeData() {
        displayPersonData();
        System.out.println("Employee ID:\t" + empId);
        System.out.println("Salary:\t\t" + salary);
    }
}