package com.pan.framework.conf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pan.framework.util.PropertiesKit;

public class Constants {
    public static final String PROP_FILE_PATH = "config";
    public static final String PROP_FILE_NAME = "config/framework_config";
    public static final String CONFIG_FILE_PATH = "/config/framework_config.properties";
    public static final String ENCODING_ISO = "ISO-8859-1";
    public static final String ENCODING_GBK = "GBK";
    public static final String ENCODING_UNICODE = "UTF-8";
    public static final int STATUS_NOT_VALID = 0;
    public static final int STATUS_VALID = 1;
    public static List<Map<Integer, String>> STATUS_LIST = new ArrayList<>();
    public static Map<Integer, String> STATUS_MAP = new HashMap<>();
    public static final int SELECT_FALSE = 0;
    public static final int SELECT_TRUE = 1;
    public static List<Map<Integer, String>> SELECT_LIST = new ArrayList<>();
    public static Map<Integer, String> SELECT_MAP = new HashMap<>();
    public static final int CACHE_TIME_1_MIN = 60;
    public static final int CACHE_TIME_5_MIN = 300;
    public static final int CACHE_TIME_10_MIN = 600;
    public static final int CACHE_TIME_15_MIN = 900;
    public static final int CACHE_TIME_20_MIN = 1200;
    public static final int CACHE_TIME_30_MIN = 1800;
    public static final int CACHE_TIME_1_HOUR = 3600;
    public static final int CACHE_TIME_2_HOUR = 7200;
    public static final int CACHE_TIME_4_HOUR = 14400;
    public static final int CACHE_TIME_8_HOUR = 28800;
    public static final int CACHE_TIME_12_HOUR = 43200;
    public static final int CACHE_TIME_1_DAY = 86400;
    public static final String SYSTEM_ENCODING = PropertiesKit.getBundleProperties("config/framework_config",
            "SYSTEM_ENCODING");
    public static final String FILE_SEPARATOR = System.getProperty("file.separator");
    public static final String PAGE_PATH = "/WEB-INF/pages/";

}
