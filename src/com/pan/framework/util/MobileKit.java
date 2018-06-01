package com.pan.framework.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author panyijie
 *
 */
public class MobileKit {
    public static final String mobileNumberRule = "1(3\\d|5[0-3,5-9]|8[0-3,5-9]|4[57]|7[0,6-8])\\d{8}"; // 手机结构正则表达式
    private static Pattern mobileNumberPattern = Pattern
            .compile("^1(3\\d|5[0-3,5-9]|8[0-3,5-9]|4[57]|7[0,6-8])\\d{8}$");

    /**
     * 验证手机好吗格式
     */
    public static boolean isValidMobileNumber(String mobile) {
        Matcher matcher = mobileNumberPattern.matcher(mobile);
        return matcher.matches();
    }
}
