package Experiment_3;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager mgr = new Manager();

        System.out.println("--- Enter Details for Manager ---");
        mgr.getManagerData(sc);

        mgr.displayManagerData();

        sc.close();
    }
}