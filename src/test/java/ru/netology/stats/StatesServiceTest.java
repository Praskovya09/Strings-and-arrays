package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatesServiceTest {

    @Test
    public void sumTest() {
        StatesService service = new StatesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmountTest() {
        StatesService service = new StatesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSalesAmount(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthWithMaxSalesTest() {
        StatesService service = new StatesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthWithMaxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthWithMinSalesTest() {
        StatesService service = new StatesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthWithMinSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsWhereSalesAreBelowAverageTest() {
        StatesService service = new StatesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthsWhereSalesAreBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsWhereSalesAreAboveAverageTest() {
        StatesService service = new StatesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthsWhereSalesAreBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}