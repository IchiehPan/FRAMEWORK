package com.pan.framework.util;

/**
 * @author panyijie
 *
 */
public class BooleanKit {
    /**
     * Boolean -> Integer
     */
    public static Integer toInteger(Boolean b) {
        if (b == Boolean.TRUE) {
            return Integer.valueOf(1);
        }
        return Integer.valueOf(0);
    }

    /**
     * Integer -> Boolean
     */
    public static Boolean toBoolean(Integer i) {
        if (i.intValue() == 1) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
