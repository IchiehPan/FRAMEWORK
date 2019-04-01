package com.pan.framework.util;

import java.util.Random;

/**
 * @author panyijie
 *
 */
public class RandomKit {
    public static final String CS_NUMBER = "0123456789";
    public static final String CS_LOWERCASE_LETTER = "abcdefghijklmnopqrstuvwxyz";
    public static final String CS_UPPERCASE_LETTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String CS_LETTER = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String CS_ALPHANUM = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String getRandomString(String candidateString, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int candidateStringLength = candidateString.length();
        for (int i = 0; i < length; i++) {
            sb.append(candidateString.charAt(random.nextInt(candidateStringLength)));
        }
        return sb.toString();
    }
}
