package com.pan.framework.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author panyijie
 *
 */
public class XMLKit {
    private static Map<String, String> elementMap = new HashMap<>();
    private static Map<String, List<?>> attributeMap = new HashMap<>();
    private final String FILENAME = "init.xml";
    private static XMLKit instance = new XMLKit();

    /**
     * 对象创建
     */
    private XMLKit() {
        init(FILENAME);
    }

    /**
     * 单例模式
     */
    public static XMLKit getInstance() {
        if (instance == null) {
            instance = new XMLKit();
        }
        return instance;
    }

    /**
     * 初始化
     */
    public void init(String fileName) {
        elementMap.clear();
        attributeMap.clear();
        String filePath = this.getClass().getResource("/").getPath();
        System.out.println("xml路径为 : " + filePath);
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(filePath + fileName);
            Element root = document.getRootElement();
            Iterator<?> elements = root.elementIterator();
            while (elements.hasNext()) {
                Element element = (Element) elements.next();
                String name = element.getName();
                String text = element.getText();
                List<?> attributes = element.attributes();
                elementMap.put(name, text);
                attributeMap.put(name, attributes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        instance = this;
    }

    public Map<String, String> getElements() {
        return elementMap;
    }

    public static String getText(String name) {
        return elementMap.get(name);
    }

    public static List<?> getAttributes(String name) {
        return attributeMap.get(name);
    }
}
