package org.example;

import java.util.Scanner;

public class Menu {
    static void start(){
        System.out.println("""
                Currency convertor
                Use three letter ISO currency code
                eg. "USD", "EUR", "CAD"
                """);

        Scanner sc = new Scanner(System.in);

        System.out.println("What currency do you want to convert from? ");
        String convertFrom = sc.next();

        System.out.println("What currency do you want to convert to?");
        String convertTo = sc.next();

        System.out.println("How much do you want to convert? ");
        double amount = sc.nextDouble();

        CurrencyConvertor cc = new CurrencyConvertor();
        cc.convert(convertTo, convertFrom, amount);

    }
}
