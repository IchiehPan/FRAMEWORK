package com.pan.framework.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author panyijie
 *
 */
public class JsoupKit {

    public static Document getDocument(String url) throws IOException {
        return Jsoup.connect(url).timeout(300000).get(); // 加载并解析网址对应的文档
    }

    /**
     * 获取控件id的的text值列表
     * 
     * @param elementIds控件id集合
     * @param searchTextArray包含searchText字符串的元素集
     */
    public static List<String> getPageValueMap(Document doc, boolean needtitle, String[] elementIds,
            String[] searchTextArray) throws Exception {
        List<String> resultList = new ArrayList<>();
        if (needtitle) {
            String title = doc.title();// 获取标题
            resultList.add(title);
        }

        for (String searchText : searchTextArray) {
            Elements elements = doc.getElementsContainingOwnText(searchText);
            for (Element element : elements) {
                resultList.add(element.text());
            }
        }
        for (String elementId : elementIds) {
            Element element = doc.getElementById(elementId);
            resultList.add(element.text());
        }
        return resultList;
    }

    /**
     * 接口调用
     * 
     * @param paramMap传递参数
     */
    public static String getPageStr(String url, Map<String, Object> paramMap) {
        Document doc = null;

        int index = 0;
        for (Entry<String, Object> entry : paramMap.entrySet()) {
            if (index == 0) {
                url += "?" + entry.getKey() + "=" + entry.getValue();
            } else {
                url += "&" + entry.getKey() + "=" + entry.getValue();
            }
            ++index;
        }
        try {
            doc = Jsoup.connect(url).timeout(300000).get();
            return doc.body().html();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
