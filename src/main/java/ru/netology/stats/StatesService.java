package ru.netology.stats;

public class StatesService {
    public long sum(long[] sales) { //сумма всех продаж
        long totalOfAllSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalOfAllSales += sales[i];
        }
        return totalOfAllSales;
    }

    public long averageSalesAmount(long[] sales) { //средня сумма продаж
        long totalOfAllSales = sum(sales);
        return totalOfAllSales / 12;
    }

    public int monthWithMaxSales(long[] sales) { //месяц с максимальными продажами
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthWithMinSales(long[] sales) { //месяц с минимальными продажами
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int monthsWhereSalesAreBelowAverage(long[] sales) { //кол-во месяцев, где продажи были ниже среднего
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSalesAmount(sales)){
                counter++;
            }
        }
        return counter;
    }

    public int monthsWhereSalesAreAboveAverage(long[] sales) { //кол-во месяцев, где продажи были выше среднего
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSalesAmount(sales)){
                counter++;
            }
        }
        return counter;
    }

}
