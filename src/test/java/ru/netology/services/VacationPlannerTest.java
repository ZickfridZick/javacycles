package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationPlannerTest {
    @Test
    public void shouldCalculateVacationMonths() {
        VacationPlanner planner = new VacationPlanner();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expectedVacationMonths = 3;
        int actualVacationMonths = planner.calculateVacationMonths(income, expenses, threshold);
        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths);
    }

    @Test
    public void shouldCalculateVacation() {
        VacationPlanner planner = new VacationPlanner();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expectedVacationMonths = 2;
        int actualVacationMonths = planner.calculateVacationMonths(income, expenses, threshold);
        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths);
    }
}
