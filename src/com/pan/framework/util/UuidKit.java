package com.pan.framework.util;

import java.util.UUID;

/**
 * @author panyijie
 *
 */
public class UuidKit {
    /**
     * 获取随机UUID字符串
     */
    public static String getUuid() {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        return id.replaceAll("-", "");
    }
}
