package com.pan.framework.util;

import java.text.DecimalFormat;

/**
 * @author panyijie
 *
 */
public class NumberKit {
    public static final String POINT = ".";

    /**
     * 验证是否正整数
     */
    public static boolean isPositiveInteger(String str) {
        boolean result = false;
        try {
            if ((StringKit.isValid(str)) && (str.indexOf(POINT) < 0) && (Integer.parseInt(str) > 0)) {
                result = true;
            }
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    /**
     * 验证是否自然数
     */
    public static boolean isAllDigit(String str) {
        boolean result = false;
        try {
            if (StringKit.isValid(str)) {
                char[] c = str.toCharArray();
                for (int i = 0; i < c.length; i++)
                    if (Character.isDigit(c[i])) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
            }
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    /**
     * Double -> String
     * 
     * @param scale小数点后位数
     */
    public static String formatDouble(double d, int scale) {
        String result = "";
        try {
            DecimalFormat df = new DecimalFormat("0." + fillZero(scale));
            result = df.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * String -> Double
     * 
     * @param scale小数点后位数
     */
    public static String formatDouble(String d, int scale) {
        String result = "";
        try {
            double temp = Double.parseDouble(d);
            result = formatDouble(temp, scale);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 填补“0”
     * 
     * @param scale小数点后位数
     */
    public static String fillZero(int scale) {
        String result = "";
        for (int i = 0; i < scale; i++) {
            result = result + "0";
        }
        return result;
    }

    /**
     * 前面填补“0”
     * 
     * @param scale小数点后位数
     */
    public static String fillPreZero(int number, int scale) {
        String result = "";
        try {
            String temp = String.valueOf(number);
            int iLen = scale - temp.length();
            if (iLen >= 0) {
                for (int i = 0; i < iLen; i++) {
                    temp = "0" + temp;
                }
            }
            result = temp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 格式化数字字符串
     * 
     * @param scale小数点后位数
     */
    public static String fillPreZero(String number, int scale) {
        return fillPreZero(Integer.parseInt(number), scale);
    }
}
