package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    void shouldCalculateMonthsOfVacation() {
        VacationService service = new VacationService();
        long income = 10_000;
        long expenses = 3_000;
        long threshold = 20_000;

        int expected = 4;
        int actual = service.calculateMonthsOfVacation(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsOfVacationWithHigherIncome() {
        VacationService service = new VacationService();
        long income = 100_000;
        long expenses = 60_000;
        long threshold = 150_000;

        int expected = 3;
        int actual = service.calculateMonthsOfVacation(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

