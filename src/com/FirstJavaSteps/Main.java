package com.FirstJavaSteps;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        double num = 0.1;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // getCurrencyInstance() is a factory maker it returns a new object
        // cannot use new to make a new instance of a abstract class NumberFormat.

        String currencyResult = currency.format(num);
        // currency now has access to format from the NumberFormat class which formats with $ and ,
        // takes a number returns a string

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentResult = percent.format(num);
        // getPercentInstance() method format. Converts number to percent and returns a string.

        // Method Chaining -------------------
        // involves using multiple methods after another

        String chainingResult = NumberFormat.getCurrencyInstance().format(num);
        // If a variable will only be used once, method chain instead.

        System.out.println(percentResult);
        System.out.println(currencyResult);
        System.out.println(chainingResult);
    }
}
