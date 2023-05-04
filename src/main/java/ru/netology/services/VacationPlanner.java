package ru.netology.services;

public class VacationPlanner {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int vacationMonths = 0;
        int vacationExpenses = expenses * 3;
        for (int i = 1; i <= 12; i++) {
            if (balance >= threshold) {
                vacationMonths++;
                balance -= expenses;
                balance -= vacationExpenses;
            } else {
                balance += income;
                balance -= expenses;
            }
        }
        return vacationMonths;
    }
}
