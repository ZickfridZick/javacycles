package ru.netology.services;

public class VacationPlanner {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
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
        return vacationMonths;
    }
}
