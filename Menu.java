package org.ronan;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    static String isISOCode() {
        String iso = "";

        while (iso.length() != 3) {
            iso = sc.next();
            if (iso.length() == 3) {
                return iso;
            } else {
                System.out.println("[INFO] " + iso + " is not a valid ISO code.");
            }
        }
        return iso;
    }

    static double isNumber() {
        double amount = 0;

        while (sc.hasNextDouble()) {
            amount = sc.nextDouble();
            if (amount > 0) {
                return amount;
            } else {
                System.out.println("[INFO] " + amount + " needs to be greater than zero/ 0.");
            }
        }
        return amount;
    }

    static void start() {
        System.out.println("""
                Currency convertor
                Use three letter ISO currency code
                eg. "USD", "EUR", "CAD"
                """);

        System.out.println("What currency do you want to convert from? ");

        String convertFrom = isISOCode();

        System.out.println("What currency do you want to convert to?");
        String convertTo = isISOCode();

        System.out.println("How much do you want to convert? ");
        double amount = isNumber();

        CurrencyConvertor cc = new CurrencyConvertor();
        cc.convert(convertTo, convertFrom, amount);

    }
}
