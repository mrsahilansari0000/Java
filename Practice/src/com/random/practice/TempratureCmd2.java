package com.random.practice;

public class TempratureCmd2 {

    public static void main(String[] args) {

        String[] day = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        String[] resultData = new String[7];

        // First loop -> check temperature and store result
        for (int i = 0; i <= 6; i++) {

            int value = Integer.parseInt(args[i]);

            if (value > 30) {
                resultData[i] = day[i] + " : " + value;
            }
        }

        // Second loop -> print stored result
        System.out.println("Temperature above 30 List Here");

        for (int i = 0; i <= 6; i++) {

            if (resultData[i] != null) {
                System.out.println(resultData[i]);
            }
        }
    }
}