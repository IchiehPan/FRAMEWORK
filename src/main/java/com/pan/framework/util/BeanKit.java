package com.pan.framework.util;

import com.alibaba.fastjson.JSON;

public class BeanKit {
    /**
     * 从一个JSON 对象字符格式中得到一个java对象
     */
    public static <T> T string2Bean(String json, Class<T> beanClass) {
        T object = JSON.parseObject(json, beanClass);
        if (object == null) {
            try {
                return (T) beanClass.getClass().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return object;// 默认为UTF-8
    }


}
