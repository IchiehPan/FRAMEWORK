package com.pan.framework.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @author panyijie
 *
 */
public class TextFileKit {
    private Path pathName = null;

    /**
     * 创建纯文本文件
     */
    public TextFileKit(Path pathName) throws IOException {
        this.pathName = pathName;
        if (Files.exists(pathName))
            Files.delete(pathName);
        Files.createFile(pathName);
    }

    /**
     * 写入内容
     */
    public synchronized void write(String content) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(pathName, Charset.forName("GBK"),
                StandardOpenOption.APPEND)) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
