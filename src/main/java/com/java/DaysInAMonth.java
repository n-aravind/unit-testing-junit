package com.java;

public class DaysInAMonth {
/*    public int getDaysInMonth(int month, int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0) {
                    return 28;
                }
                    return 29;
            } else {
                return 28;
            }
        }
        return 31;
    }*/

    public int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return daysInFeb(year);
            default:
                return 31;
        }
    }

    private int daysInFeb(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            return 28;
        }
        return 29;
    }
}
