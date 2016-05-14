package com.opinio.crm.common;

import java.util.Random;

/**
 * Created by Vineet on 14/05/16.
 */
public class CommonUtils {

    public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
