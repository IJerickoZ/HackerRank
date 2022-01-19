package com.example.demo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputDate = input.nextLine();
        String[] date = inputDate.split(" ");
        Integer month = Integer.parseInt(date[0].toString());
        Integer day = Integer.parseInt(date[1].toString());
        Integer year = Integer.parseInt(date[2].toString());
        System.out.print(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year){
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEEE");
        String formattedDate = date.format(myFormatObj);
        return formattedDate;
    }
}
