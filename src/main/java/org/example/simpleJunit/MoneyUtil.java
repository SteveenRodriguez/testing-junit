package org.example.simpleJunit;

import java.text.DecimalFormat;

public class MoneyUtil {

    public static String format(double money) {
        return format(money, "$");
    }

    public static String format(double money, String symbol) {
        if(symbol == null) {
            throw new IllegalArgumentException();
        }

        if (money < 0) {
            symbol = "-" + symbol;
            money = money * (-1);// si viene negativo lo convierte a positivo
        }
        DecimalFormat rounded = new DecimalFormat("#.00");
        String resultado = rounded.format(money);
        return symbol + resultado.replace(",", ".");
    }
}
