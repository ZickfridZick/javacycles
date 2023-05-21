package ru.netology;

public class Main {
    public static void main(String[] args) {
        {
            int income = 10000;
            int expenses = 3000;
            int threshold = 20000;
            int balance = 0;
            int vacationMonths = 0;
            for (int i = 1; i <= 12; i++) {
                if (balance >= threshold) {
                    balance -= expenses;
                    balance /= 3;
                    vacationMonths++;
                } else {
                    balance += income;
                    balance -= expenses;
                }
            }
            System.out.println(vacationMonths);
        }
    }
}