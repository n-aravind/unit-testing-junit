package com.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetDaysInAMonthTest {

    private DaysInAMonth daysInAMonth;

    @Before
    public void setup(){
        daysInAMonth = new DaysInAMonth();
    }

    @Test
    public void getDaysInJanuary2019(){
        assertEquals(31,daysInAMonth.getDaysInMonth(1,2019));
    }

    @Test
    public void getDaysInMarch2019(){
        assertEquals(31,daysInAMonth.getDaysInMonth(3,2019));
    }

    @Test
    public void getDaysInApril2019(){
        assertEquals(30,daysInAMonth.getDaysInMonth(4,2019));
    }

    @Test
    public void getDaysInMay2019(){
        assertEquals(31,daysInAMonth.getDaysInMonth(5,2019));
    }

    @Test
    public void getDaysInJune2019(){
        assertEquals(30,daysInAMonth.getDaysInMonth(6,2019));
    }

    @Test
    public void getDaysInJuly2019(){
        assertEquals(31,daysInAMonth.getDaysInMonth(7,2019));
    }

    @Test
    public void getDaysInAugust2019(){
        assertEquals(31,daysInAMonth.getDaysInMonth(8,2019));
    }

    @Test
    public void getDaysInSeptember2019(){
        assertEquals(30,daysInAMonth.getDaysInMonth(9,2019));
    }

    @Test
    public void getDaysInOctober2019(){
        assertEquals(31,daysInAMonth.getDaysInMonth(10,2019));
    }

    @Test
    public void getDaysInNovember2019(){
        assertEquals(30,daysInAMonth.getDaysInMonth(11,2019));
    }

    @Test
    public void getDaysInDecember2019(){
        assertEquals(31,daysInAMonth.getDaysInMonth(12,2019));
    }

    @Test
    public void getDaysInFebruaryNonLeapYear(){
        assertEquals(28,daysInAMonth.getDaysInMonth(2,2019));
    }

    @Test
    public void getDaysInFebruaryLeapYear(){
        assertEquals(29,daysInAMonth.getDaysInMonth(2,2020));
    }

    @Test
    public void getDaysInFebruaryCenturyYear(){
        assertEquals(28,daysInAMonth.getDaysInMonth(2,1900));
    }

    @Test
    public void getDaysInFebruaryCenturyDivisibleBy400Year(){
        assertEquals(29,daysInAMonth.getDaysInMonth(2,1600));
    }


    @After
    public void tearDown(){
        daysInAMonth = null;
    }
}
