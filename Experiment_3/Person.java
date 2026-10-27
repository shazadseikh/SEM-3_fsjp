package Experiment_3;

import java.util.Scanner;

class Person {
    String name;
    int age;

    void getPersonData(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine(); // Consume newline
    }

    void displayPersonData() {
        System.out.println("Name:\t\t" + name);
        System.out.println("Age:\t\t" + age);
    }
}