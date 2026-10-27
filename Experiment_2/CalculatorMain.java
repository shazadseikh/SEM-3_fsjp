package Experiment_2;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 1. CONSTRUCTOR OVERLOADING DEMO =====");
        
        // Using Default Constructor
        Calculator c1 = new Calculator();
        System.out.println("Using default constructor:");
        c1.displayResult();

        System.out.println("\n-------------------------------------------");

        // Using Parameterized Constructor
        Calculator c2 = new Calculator(25.5, 14.5);
        System.out.println("Using parameterized constructor:");
        c2.displayResult();

        System.out.println("\n===== 2. METHOD OVERLOADING DEMO =====");
        
        Calculator calc = new Calculator();
        
        // Calling integer add method
        int intSum = calc.add(10, 20);
        System.out.println("Sum of integers (10, 20) = " + intSum);

        // Calling double add method
        double doubleSum = calc.add(15.75, 10.25);
        System.out.println("Sum of doubles (15.75, 10.25) = " + doubleSum);

        sc.close();
    }
}