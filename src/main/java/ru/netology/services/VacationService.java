package ru.netology.services;

public class VacationService {

    public int calculateVacationMonths(int income, int expenses, int threshold){

        int vacationMonths = 0;
        int savings = 0;

        System.out.println();

        for(int i = 1; i <= 12; i++){

            if(savings >= threshold){

                int vacationCost = 2 * (savings - expenses) / 3;

                System.out.println("Месяц " + i + ": денег " + savings + ". Буду отдыхать. Потратил -" + expenses + ",затем еще -" + vacationCost);
                vacationMonths += 1;
                savings = (savings - expenses) / 3;
            }
            else{

                System.out.println("Месяц " + i + ": денег " + savings + ". Придется работать. Заработал +" + income + ",потратил -" + expenses);
                savings += income - expenses;
            }
        }
        return vacationMonths;
    }
}
