package com.pan.framework.util;

/**
 * @author panyijie
 *
 */
public class HtmlStringKit {
    /**
     * Tag转义
     * 
     * @param strHTML代码
     */
    public static String chopTag(String str) {
        if (!StringKit.isValid(str)) {
            str = str.replaceAll("<", "&lt;");
            str = str.replaceAll(">", "&gt;");
        }
        return str;
    }

    /**
     * @param strHTML代码
     */
    public static String chopQuot(String str) {
        if (!StringKit.isValid(str)) {
            str = str.replaceAll("'", "`");
            str = str.replaceAll("\"", "`");
        }

        return str;
    }

    /**
     * HTML转义
     * 
     * @param strHTML代码
     */
    public static String toHtml(String str) {
        str = str.replaceAll("&", "&amp;");
        str = str.replaceAll("\"", "&quot;");
        str = str.replaceAll("<", "&lt;");
        str = str.replaceAll(">", "&gt;");
        str = str.replaceAll("\r\n", "<br>");
        str = str.replaceAll("\n", "<br>");
        str = str.replaceAll("\t", "&nbsp&nbsp&nbsp&nbsp");
        str = str.replaceAll(" ", "&nbsp");

        return str;
    }
}
