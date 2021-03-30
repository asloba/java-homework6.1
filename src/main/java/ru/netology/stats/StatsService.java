package ru.netology.stats;

public class StatsService {

    public int shouldReturnSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int shouldReturnAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int shouldReturnMontWithMaxSales(int[] sales) {
        int currentMax = sales[0];
        for (int sale : sales) {
            if (currentMax < sale) {
                currentMax = sale;
            }
        }
        int month = 0;
        int maxMonth = 0;
        for (int sale : sales) {
            month += 1;
            if (sale == currentMax) {
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public int shouldReturnMontWithMinSales(int[] sales) {
        int currentMin = sales[0];
        for (int sale : sales) {
            if (currentMin > sale) {
                currentMin = sale;
            }
        }
        int month = 0;
        int minMonth = 0;
        for (int sale : sales) {
            month += 1;
            if (sale == currentMin) {
                minMonth = month;
            }
        }
        return minMonth;
    }

    public int shouldReturnLowerThanAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        int monthNumber = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthNumber += 1;
            }
        }
        return monthNumber;
    }

    public int shouldReturnHigherThanAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        int monthNumber = 0;

        for (int sale : sales) {
            if (sale > average) {
                monthNumber += 1;
            }
        }
        return monthNumber;
    }
}

