package com.pan.framework.util;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author panyijie
 *
 */
public class SetKit {
    /**
     * String -> Set
     */
    public static HashSet<String> string2Set(String str, String regex) {
        HashSet<String> set = new HashSet<String>();
        if (StringKit.isValid(str)) {
            String[] array = str.split(regex);
            for (String s : array) {
                set.add(s);
            }
        }
        return set;
    }

    /**
     * String -> Set
     */
    @SuppressWarnings("unchecked")
    public static <E> HashSet<E> string2Set(String str, String regex, Class<?> clazz) {
        HashSet<E> set = new HashSet<E>();
        if (StringKit.isValid(str)) {
            String[] array = str.split(regex);
            for (String s : array) {
                Object obj = null;
                if (clazz == Integer.class)
                    obj = Integer.valueOf(Integer.parseInt(s));
                else {
                    obj = s;
                }
                set.add((E) obj);
            }
        }
        return set;
    }

    /**
     * Set -> String
     */
    public static <E> String set2String(HashSet<E> set, String regex) {
        StringBuffer sb = new StringBuffer();
        for (Iterator<E> localIterator = set.iterator(); localIterator.hasNext();) {
            Object element = localIterator.next();
            if (sb.length() > 0) {
                sb.append(regex);
            }
            sb.append(element);
        }
        return sb.toString();
    }
}
