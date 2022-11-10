package controller;

import java.util.Scanner;

/*
Method Abstraction
abstraction is achieved by separating the use of a method from its implementation
Details are hidden.

This program displays a calendar

Way of working
enter stubs, incomplete version of methode
fill in de methods
*/
public class PrintCalendar {
    public static void main(String[] args) {

        //prompt input         //read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year (e.g.: 2022)");
        int year = scanner.nextInt();

        System.out.println("Enter the month as number between 1 and 12");
        int month = scanner.nextInt();

        //display month and year
        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    //Print title
    public static void printMonthTitle(int year, int month) {
        System.out.println("          " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------"); //display dashline
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");  //display days of the week
    }

    //Print Month body
    //getMonthName
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "Juli";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        //how many days in a month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        //create spaces before the day of the month begins
        int i =0;
        for (i = 0; i < startDay; i++)
            System.out.println("   ");

        for ( i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    //GetStartDay counting from jan 1 1800 was wednesday
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    //getTotalNumberOfDays
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;
//Goes through the monthe to check how many days are ther in a month
        for (int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);
        return total;
    }


    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if
        (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2)
            return isLeapYear(year) ? 29 : 28;
        return 0;//incorrect input
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}










