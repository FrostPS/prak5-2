package org.example;
public class VacationService {
    public int calculateMonthsOfVacation(long income, long expenses, long threshold) {
        long currentBalance = 0;
        int vacationMonths = 0;

        for (int month = 0; month < 12; month++) {
            if (currentBalance >= threshold) {
                vacationMonths++;
                currentBalance -= expenses; // Траты на жизнь
                currentBalance -= (currentBalance / 3); // Траты на отдых
            } else {
                currentBalance += income; // Получаем доход
                currentBalance -= expenses; // Траты на жизнь
            }
        }
        return vacationMonths;
    }
}
