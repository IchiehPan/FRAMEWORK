package com.pan.framework.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author panyijie
 *
 */
public class EmailKit {
    public static final String emailAddressRule = "[A-Za-z0-9]+([_\\-\\.]?[A-Za-z0-9]+[_\\-]?){0,10}@[A-Za-z0-9]+([\\.\\-]?[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})+"; // Email地址正则表达式
    private static Pattern emailAddressPattern = Pattern.compile(
            "^[A-Za-z0-9]+([_\\-\\.]?[A-Za-z0-9]+[_\\-]?){0,10}@[A-Za-z0-9]+([\\.\\-]?[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})+$");

    /**
     * 验证Email地址是否正确
     */
    public static boolean isValidEmailAddress(String email) {
        if ((!StringKit.isValid(email)) || (email.length() > 100) || (email.indexOf("@") <= 0)) {
            return false;
        }
        Matcher matcher = emailAddressPattern.matcher(email);
        return matcher.matches();
    }
}
