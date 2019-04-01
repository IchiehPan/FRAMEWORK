package com.pan.framework.util;

import java.util.List;

/**
 * @author panyijie
 *
 */
public class ListKit {
    /**
     * List -> String
     */
    public static String list2String(List<?> list) {
        StringBuffer result = new StringBuffer();
        for (Object obj : list) {
            result.append(obj.toString() + ",");
        }
        String str = new String(result.substring(0, result.length() - 1));
        return str;
    }
}
