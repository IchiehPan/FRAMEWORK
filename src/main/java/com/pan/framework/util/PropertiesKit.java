package com.pan.framework.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;

public class PropertiesKit {

    public static Properties getProperties(String fileName) {
        Properties properties = null;

        try {
            BufferedInputStream e = new BufferedInputStream(new FileInputStream(fileName));
            properties = new Properties();
            properties.load(e);
        } catch (Exception arg2) {
            arg2.printStackTrace();
        }

        return properties;
    }

    public static String getProperties(String fileName, String key) {
        String result = null;

        try {
            result = getProperties(fileName).getProperty(key);
        } catch (Exception arg3) {
            arg3.printStackTrace();
        }

        return result;
    }

    public static Map<String, String> getAllProperties(String fileName) {
        HashMap<String, String> map = new HashMap<>();

        try {
            Properties e = getProperties(fileName);
            Set<Object> keySet = e.keySet();
            Iterator<Object> it = keySet.iterator();

            while (it.hasNext()) {
                String key = it.next().toString();
                map.put(key, e.getProperty(key));
            }
        } catch (Exception arg5) {
            arg5.printStackTrace();
        }

        return map;
    }

    public static String getBundleProperties(String fileName, String key) {
        String result = null;

        try {
            PropertyResourceBundle e = (PropertyResourceBundle) ResourceBundle.getBundle(fileName);
            result = e.getString(key);
        } catch (Exception arg3) {
            arg3.printStackTrace();
        }

        return result;
    }

    public static Map<String, String> getBundleAllProperties(String fileName) {
        HashMap<String, String> map = new HashMap<String, String>();

        try {
            PropertyResourceBundle e = (PropertyResourceBundle) ResourceBundle.getBundle(fileName);
            Enumeration<String> emun = e.getKeys();

            while (emun.hasMoreElements()) {
                String key = (String) emun.nextElement();
                map.put(key, e.getString(key));
            }
        } catch (Exception arg4) {
            arg4.printStackTrace();
        }

        return map;
    }
}