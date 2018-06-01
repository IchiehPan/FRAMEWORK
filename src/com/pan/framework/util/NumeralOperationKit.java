package com.pan.framework.util;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class NumeralOperationKit {
    public static double add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));

        return b1.add(b2).doubleValue();
    }

    public static double subtract(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));

        return b1.subtract(b2).doubleValue();
    }

    public static double multiply(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));

        return b1.multiply(b2).doubleValue();
    }

    public static double divide(double value1, double value2, int scale) {
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));

        return b1.divide(b2, scale, 4).doubleValue();
    }

    public static double divide(double value1, double value2, int scale, int roundingMode) {
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));

        return b1.divide(b2, scale, roundingMode).doubleValue();
    }

    public static double round(double value, int scale) {
        BigDecimal b = new BigDecimal(String.valueOf(value));

        return b.divide(BigDecimal.ONE, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static String calculatePercent(double numerator, double total, int scale) {
        String result = "";
        try {
            double rate = 0.0D;
            if (total != 0.0D) {
                rate = multiply(divide(numerator, total, scale + 2), 100.0D);
            }

            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            numberFormat.setMaximumFractionDigits(scale);
            rate = Double.parseDouble(numberFormat.format(rate));

            result = NumberKit.formatDouble(rate, scale);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
