package Experiment_2;

/*
    Aim: WAP to create a calculator class to add two numbers. Use constructor overloading to
         initialize the data with either default values or user provided values. Use method
         overloading to add integer or double.
    Coder: Shahajad sheikh
    Class: Computer Engineering: A div
    UIN/Roll No: 241P007/70
*/

public class Calculator {
    double num1, num2;

    // Default Constructor
    Calculator() {
        this.num1 = 0.0;
        this.num2 = 0.0;
    }

    // Parameterized Constructor (Constructor Overloading)
    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method Overloading: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method Overloading: Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method to display result
    void displayResult() {
        System.out.println("Values -> num1: " + num1 + ", num2: " + num2);
        System.out.println("Addition Result = " + (num1 + num2));
    }
}