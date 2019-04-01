package com.pan.framework.conf;

import com.pan.framework.util.PropertiesKit;

public class DBConfig {

    public static final String TEST_PROP_FILE_NAME = Constants.PROP_FILE_PATH + "/db_config";

    public static String DB_LINK_TEST_W = PropertiesKit.getBundleProperties(TEST_PROP_FILE_NAME, "DB_LINK_TEST_W");

    public static String DB_LINK_TEST_R = PropertiesKit.getBundleProperties(TEST_PROP_FILE_NAME, "DB_LINK_TEST_R");

}
